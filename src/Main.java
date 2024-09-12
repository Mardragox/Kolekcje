public class Main {
    public static void main(String[] args) {

        //tablice

        /*
        tablica musi mieć zdefiniowany rozmiar, którego potem nie można zmienić
        tablica przechowuje typy proste i złożone
         */


        int [] tablicaLiczbLosowych = new int [6];
        //losowanie wartości z zakresu 1 do 100

        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {

            tablicaLiczbLosowych[i] = (int) ((Math.random() * 100 )+ 1);
        }
        //wypisywanie foreachem
        for (int element:tablicaLiczbLosowych) {

            System.out.print(element + ", ");

        }
    }
}