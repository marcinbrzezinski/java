import static java.lang.System.*;

public class Auto {

    String nazwa;
    String typ;
    double pojSilnika;
    double pojBaku;
    int rokProdukcji;

    Auto(String nazwa, String typ, double pojSilnika, double pojBaku, int rokProdukcji) {
        this.nazwa = nazwa;
        this.typ = typ;
        this.pojBaku = pojBaku;
        this.pojSilnika = pojSilnika;
        this.rokProdukcji = rokProdukcji;
    }

    boolean jestWlaczony;

    boolean wlaczSilnik() {
        if (jestWlaczony == false) {
            jestWlaczony = true;
            predkosc = 0;
        } else {
            out.println("Silnik juz jest wlaczony");
        }
        return jestWlaczony;
    }

    boolean czyWlaczony() {
        return jestWlaczony;
    }

    int ktoryWlasciciel = 1;

    int sprzedaj() {
        return ++ktoryWlasciciel;
    }

    double stanPaliwa = 15.0;
    double tankuj(double dolewka){
        if (dolewka > 0 && pojBaku - stanPaliwa >= dolewka){
            stanPaliwa += dolewka;
        }else{
            out.println("Nieodpowiednia ilosc dolewki");
        }return stanPaliwa;
    }
    int predkosc;
    int zwiekszPredkosc() {
        predkosc += 10;
        return predkosc;
    }
    int zmniejszPredkosc(){
        if (predkosc >= 10){
            predkosc -= 10;
        }else{
            out.println("Nie ma z czego zmniejszyc predkosci :)");
        }
        return predkosc;
    }
    void wyswietlInfo(){
        out.println("Nazwa: " + nazwa);
        out.println("Typ pojazdu: " + typ);
        out.println("Pojemnosc silnika: " + pojSilnika);
        out.println("Pojemnosc baku: " + pojBaku);
        out.println("Rok produkcji: " + rokProdukcji);
        out.println("Stan paliwa: " + stanPaliwa);
        out.println("Ktory właściciel: " + ktoryWlasciciel);
        out.println("Prędkość: " + predkosc);
        out.println("Włączony: " + czyWlaczony());
        out.println("Liczba samochodow wlasciciela: " + liczbaSamochodowWlasciciela);
        out.println("=======================================");
    }
    static int liczbaSamochodowWlasciciela = 0;
    public static void main(String[] arguments){
        Auto auto = new Auto("Syrena Bosto", "Van", 2.0, 55.0, 1970);

        auto.sprzedaj();
        auto.czyWlaczony();
        auto.wyswietlInfo();
        auto.wlaczSilnik();
        auto.czyWlaczony();
        auto.tankuj(12.0);
        auto.tankuj(12.0);
        auto.tankuj(12.0);
        auto.zwiekszPredkosc();
        auto.zwiekszPredkosc();
        auto.wyswietlInfo();
    }
}