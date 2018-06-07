
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
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
        double srednia = suma / rozmiar;
        System.out.println("Srednia: " + srednia);

        Arrays.sort(tablica);
        System.out.println("Posortowana tablica: ");
        for (int index = 0; index < rozmiar; index++) {
            System.out.print(tablica[index] + " ");
        }
        boolean parzysta;
        if (rozmiar % 2 == 0) {
            parzysta = true;
        } else {
            parzysta = false;
        }
        System.out.println("Parzysta: " + parzysta);

        double mediana;
        if (parzysta) {
            double lewa = tablica[rozmiar / 2 - 1];
            double prawa = tablica[rozmiar / 2 + 1];
            mediana = (lewa + prawa) / 2.0;
            System.out.println("Mediana.: " + mediana);
        } else {
            int srodek = (rozmiar + 1) / 2;
            mediana = tablica[srodek - 1];
            System.out.println("Mediana: " + mediana);
        }
        // zapisywanie do pliku
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("wynik.txt");   // <== try nie jest wymagany, lecz używam go do zamkniecia pliku
            fileWriter.write("Mediana: " + mediana);
            fileWriter.write("Srednia: " + srednia);

        }finally {
            if (fileWriter != null){
                fileWriter.close();
            }
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