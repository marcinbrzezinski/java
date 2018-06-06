public class Ksiazka {
    private String autor;
    private String tytul;
    private String wydawca;
    private String ISBN;
    private int rok;
    private int liczbaStron;
    Ksiazka(String autor,
            String tytul,
            String wydawca,
            String ISBN,
            int rok,
            int liczbaStron){
        this.autor = autor;
        this.tytul = tytul;
        this.wydawca = wydawca;
        this.ISBN = ISBN;
        this. rok = rok;
        this. liczbaStron = liczbaStron;
        this.czyWypozyczona = false;
    }

    public boolean czyWypozyczona;

    void wypozycz(){
        czyWypozyczona = true;
    }

    void oddaj(){
        czyWypozyczona = false;
    }

    void wyswietlKsiazke(){
        System.out.println("Autor: " + autor);
        System.out.println("Tytuł: " + tytul);
        System.out.println("Wydawca: " + wydawca);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Rok: " + rok);
        System.out.println("Liczba stron: " + liczbaStron);
    }

    boolean sprawdzTytul(String tytul){
        return this.tytul == tytul;
    }

}

