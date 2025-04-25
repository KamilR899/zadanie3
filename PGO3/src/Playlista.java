import java.util.ArrayList;
import java.util.List;

public class Playlista {
    private List<String> nazwyPlaylist;
    private List<List<String>> utworyPlaylist;

    public Playlista() {
        this.nazwyPlaylist = new ArrayList<>();
        this.utworyPlaylist = new ArrayList<>();
    }

    public void utworzPlayliste(String nazwaPlaylisty) {
        nazwyPlaylist.add(nazwaPlaylisty);
        utworyPlaylist.add(new ArrayList<>());
    }

    public void dodajUtworDoPlaylisty(String utwor, String nazwaPlaylisty) {
        int index = nazwyPlaylist.indexOf(nazwaPlaylisty);
        if (index != -1) {
            utworyPlaylist.get(index).add(utwor);
        }
    }

    public void wyswietlPlayliste(String nazwaPlaylisty) {
        int index = nazwyPlaylist.indexOf(nazwaPlaylisty);
        if (index != -1) {
            System.out.println("Playlista: " + nazwaPlaylisty);
            for (String utwor : utworyPlaylist.get(index)) {
                System.out.println("- " + utwor);
            }
        }
    }

    public void wyswietlWszystkiePlaylisty() {
        System.out.println("Wszystkie playlisty:");
        for (String nazwa : nazwyPlaylist) {
            System.out.println("- " + nazwa);
        }
    }

    public void usunUtworZPlaylisty(String utwor) {
        for (List<String> lista : utworyPlaylist) {
            lista.remove(utwor);
        }
    }

    public int getLiczbaPlaylist() {
        return nazwyPlaylist.size();
    }
}
