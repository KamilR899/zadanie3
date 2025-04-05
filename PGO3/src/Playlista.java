import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlista {
    private Map<String, List<String>> playlisty;

    public Playlista() {
        this.playlisty = new HashMap<>();
    }

    public void utworzPlayliste(String nazwaPlaylisty) {
        playlisty.put(nazwaPlaylisty, new ArrayList<>());
    }

    public void dodajUtworDoPlaylisty(String utwor, String nazwaPlaylisty) {
        if (playlisty.containsKey(nazwaPlaylisty)) {
            playlisty.get(nazwaPlaylisty).add(utwor);
        }
    }

    public void wyswietlPlayliste(String nazwaPlaylisty) {
        if (playlisty.containsKey(nazwaPlaylisty)) {
            System.out.println("Playlista: " + nazwaPlaylisty);
            for (String utwor : playlisty.get(nazwaPlaylisty)) {
                System.out.println("- " + utwor);
            }
        }
    }

    public void wyswietlWszystkiePlaylisty() {
        System.out.println("Wszystkie playlisty:");
        for (String nazwa : playlisty.keySet()) {
            System.out.println("- " + nazwa);
        }
    }

    public void usunUtworZPlaylisty(String utwor) {
        for (List<String> lista : playlisty.values()) {
            lista.remove(utwor);
        }
    }

    public int getLiczbaPlaylist() {
        return playlisty.size();
    }
}
