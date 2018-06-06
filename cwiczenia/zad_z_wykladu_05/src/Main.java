public class Main {

    public static void main(String[] args) {
        try {
            String liczba = "12.0";
            double sparsowanaLiczba = Double.parseDouble(liczba);
            if(sparsowanaLiczba <= 0){
                throw new ArithmeticException();
            }
            double logarytm = Math.log(Double.parseDouble(liczba));

            System.out.println("log(" + liczba + ") =" + logarytm);
        } catch (NumberFormatException e){
            System.out.println("Nieprawidłowy format zmiennej.");
        }catch (ArithmeticException s){
            System.out.println("Logarytm z liczby ujemnej nie istnieje");
        }finally {
            System.out.println("Tutaj kończy się nasz program :-)");
        }

    }


}
