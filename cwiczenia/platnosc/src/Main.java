import static java.lang.System.out;

public class Main {
    private static double licz40(double stawka, double liczbaGodzin){
        return stawka * liczbaGodzin;
    }

    private static double liczPonad40(double stawka, double liczbaGodzin){
        return 40.0 * stawka + (liczbaGodzin - 40.0) * stawka  * 1.5;
    }

    private static void  liczPlaceDoladnie(double liczbaGodzin){
        if(liczbaGodzin > 60){
            out.println("Przepracowany pracownik");
        }else if (liczbaGodzin <= 40){
            out.println("Wypłać: " + licz40(stawka, liczbaGodzin));
        }else{
            out.println("Wypłać: " + liczPonad40(stawka, liczbaGodzin));
        }
    }

    public static void liczPlace(double stawka, double liczbaGodzin){
        if(stawka > 13.70){
           liczPlaceDoladnie(liczbaGodzin);
        }else{
            out.println("Za mała stawka godzinowa");
        }

    }


    public static void main(String[] args) {

        double rate = 15.0;
        double minRate = 13.70;
        double maxHours = 60.0;
        double overtime40 = rate * 1.5;
        double workTime = 70.0;


        if (workTime < maxHours) {
            if (workTime < 40.0) {
                out.println("Twoja pensja wynosi: " + workTime * rate);
            } else {
                out.println("Twoja pensja wynosi: " + workTime * overtime40);
            }
        } else {
            out.println("Nie możesz przekroczyć 60 godzin!");

        }
    }
}