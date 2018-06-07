import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program do listowania nazw miast \nPodaj nazwy miast: ");
        Scanner scanner = new Scanner(System.in);
        Set zbiorMiast = new HashSet();

        while (true){
            String wyraz = scanner.next();
            if(wyraz.equals("koniec")){
                break;
            }else{
                zbiorMiast.add(wyraz);
            }
        }
        System.out.println("Podane nazwy miast to: \n" + zbiorMiast);


    }
}
