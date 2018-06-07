public class Main {

    public static void main(String[] args) {
//       Jesiotr jesiotr = new Jesiotr();
//
//       jesiotr.poruszajSie();
//       System.out.println(jesiotr);

       Zwierze[] zwierzeta = new Zwierze[3];        // <== lepsza wersja tego co wyzej
// polimorfizm
       zwierzeta[0] = new Jamnik();
       zwierzeta[1] = new Jesiotr();
       zwierzeta[2] = new Szpak();

//       for (int indeks = 0; indeks < 3; indeks++){
//           zwierzeta[indeks].poruszajSie();        //   <= petla bedzie dzialala tak samo jak ta nizej
//           System.out.println(zwierzeta[indeks]);
        for (Zwierze zwierze : zwierzeta){
            System.out.println(zwierze);
            zwierze.poruszajSie();



       }
    }
}
