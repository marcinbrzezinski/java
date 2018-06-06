
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int rozmiar = -1;
        System.out.println("Program liczy średnią i medianę z wartości podanych przez użytkownika.");
        System.out.println("Podaj rozmiar tablicy ");
        Scanner scanner = new Scanner(System.in);

        try {
            rozmiar = scanner.nextInt();
            //   if(rozmiar) <= 0 throw  -----> nalezy dodać aby wczytywac wieksze od 0!
        } catch (InputMismatchException e) {
            System.out.println("Wporowadziłeś niewłaściwą wartość!");
        }
        System.out.println("Wczytana wartość to: " + rozmiar);

        double[] tablica = new double[rozmiar];
        System.out.println("Podaj wartość do tablicy: ");
        for (int index = 0; index < rozmiar; index++) {
            tablica[index] = scanner.nextDouble(); // wyjatki bo uzytkowniek moze nie podac double
        }
        for (int index = 0; index < rozmiar; index++) {
            System.out.print(tablica[index] + " ");
        }
        double suma = 0.0;
        for (int index = 0; index < rozmiar; index++) {
            suma += tablica[index];
        }
        System.out.println("Suma: " + suma);
        System.out.println("Srednia: " + suma / rozmiar);

        Arrays.sort(tablica);
        System.out.println("Posortowana tablica: ");
        for (int index = 0; index < rozmiar; index++) {
            System.out.print(tablica[index] + " ");
        }
        boolean parzysta;
        if(rozmiar % 2 == 0){
            parzysta = true;
        }else {
            parzysta = false;
        }
        System.out.println("Parzysta: " + parzysta);
        if (parzysta){
            double lewa = tablica[rozmiar / 2 - 1];
            double prawa = tablica[rozmiar / 2 + 1];
            System.out.println("Mediana: " + (lewa + prawa) / 2.0);
        }else{
            int srodek = (rozmiar + 1) / 2;
            System.out.println("Mediana: " + tablica[srodek - 1]);
        }

    }

}

//      Napisać program, który pobiera od użytkownika rozmiar
//      tablicy.
//      Następnie tworzy tablicę o ustalonym rozmiarze.
//      Wczytujemy wartości podane przez użytkownika z konsoli.
//      W dalszej kolejności liczy średnią oraz medianę i zapisuje te
//      wartości do pliku.
//      Do posortowania tablicy użyj: Arrays.sort(tablica);