import java.util.ArrayList;
import java.util.List;

public class BibliotekaMuzyczna {
    private String nazwa;
    private String wlasciciel;
    private List<String> utwory;

    public BibliotekaMuzyczna(String nazwa, String wlasciciel) {
        this.nazwa = nazwa;
        this.wlasciciel = wlasciciel;
        this.utwory = new ArrayList<>();
    }

    public void dodajUtwor(String utwor) {
        utwory.add(utwor);
    }

    public void wyswietlUtwory() {
        System.out.println("Utwory w bibliotece " + nazwa + ":");
        for (String utwor : utwory) {
            System.out.println("- " + utwor);
        }
    }

    public void usunUtwor(String utwor) {
        utwory.remove(utwor);
    }

    public int getLiczbaUtworow() {
        return utwory.size();
    }

    public List<String> getUtwory() {
        return new ArrayList<>(utwory);
    }
}
