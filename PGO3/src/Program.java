public class Program {
    public static void main(String[] args) {
        // Utworzenie nowej biblioteki muzycznej
        BibliotekaMuzyczna mojaBiblioteka = new
                BibliotekaMuzyczna("Kolekcja Rockowa", "Jan Kowalski");
        // Dodawanie utworów do biblioteki
        mojaBiblioteka.dodajUtwor("Led Zeppelin - Stairway to Heaven");
        mojaBiblioteka.dodajUtwor("Queen - Bohemian Rhapsody");
        mojaBiblioteka.dodajUtwor("Pink Floyd - Comfortably Numb");
        mojaBiblioteka.dodajUtwor("AC/DC - Back in Black");
        mojaBiblioteka.dodajUtwor("Metallica - Nothing Else Matters");
        // Wyświetlenie wszystkich utworów
        mojaBiblioteka.wyswietlUtwory();

        // Tworzenie obiektu Playlista
        Playlista mojaPlaylista = new Playlista();
        // Tworzenie playlist
        mojaPlaylista.utworzPlayliste("Ulubione");
        mojaPlaylista.utworzPlayliste("Na imprezę");
        // Dodawanie utworów do playlist
        mojaPlaylista.dodajUtworDoPlaylisty("Queen - Bohemian Rhapsody", "Ulubione");
        mojaPlaylista.dodajUtworDoPlaylisty("Pink Floyd - Comfortably Numb", "Ulubione");
        mojaPlaylista.dodajUtworDoPlaylisty("AC/DC - Back in Black", "Na imprezę");
        mojaPlaylista.dodajUtworDoPlaylisty("Metallica - Nothing Else Matters", "Na imprezę");
        // Wyświetlenie wszystkich playlist
        mojaPlaylista.wyswietlWszystkiePlaylisty();
        // Wyświetlenie zawartości playlisty "Ulubione"
        mojaPlaylista.wyswietlPlayliste("Ulubione");
        // Wyszukiwanie utworów z frazą "Queen"
        // (Brak zmiany, ponieważ wyszukiwanie utworów pozostaje w BibliotekaMuzyczna)
        // Usunięcie utworu z biblioteki
        mojaBiblioteka.usunUtwor("AC/DC - Back in Black");
        // Sprawdzenie czy utwór został usunięty z playlisty
        mojaPlaylista.usunUtworZPlaylisty("AC/DC - Back in Black");
        mojaPlaylista.wyswietlPlayliste("Na imprezę");
        System.out.println("Łączna liczba utworów w bibliotece: " +
                mojaBiblioteka.getLiczbaUtworow());
        System.out.println("Łączna liczba playlist: " +
                mojaPlaylista.getLiczbaPlaylist());
    }
}