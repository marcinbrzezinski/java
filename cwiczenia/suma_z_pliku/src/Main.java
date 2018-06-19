import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Program wczytuje plik CSV i dodje wartośći z wierszy");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("plik.csv"));
            String linia;
            while (true) {
                linia = bufferedReader.readLine();
                if (linia == null) break;
                double suma = Arrays.asList(linia.split(","))
                        .stream()
                        .map(el -> el.trim())
                        .mapToDouble(Double::parseDouble)
                        .sum();
            System.out.println("Suma elementów wiersza wynosi: " + suma);
            }

        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }


    }
}
