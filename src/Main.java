import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

        //wypełnianie kolekcji wartościami losowymi

        /*
        koelkcja może przechowywać tylko typy złożone
        np Integer
        kolekcja nie musi mieć zdefiniowanego rozmiaru
        rozmiar może się zmieniać w trakcie

        List -> ArrayList, LinkedList,
        Set -> HashSet
        Map


         */

        List<Integer> listaLiczbLosowych = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
           int liczba = (int) ((Math.random() * 10));
            listaLiczbLosowych.add(liczba);

        }
        System.out.println("");
        System.out.println("Wylosowana Lista");
        for (Integer element: listaLiczbLosowych)
        {

            System.out.print(element + ", ");

        }
        System.out.println(listaLiczbLosowych);

        //losowanie do list bez powtórzeń

        ArrayList<Integer> listaLosowychBezPowtorzen = new ArrayList<>();
        int liczba;
        for (int i = 0; i < 6; i++) {
            liczba = (int)(Math.random()*10+1);

            while(listaLosowychBezPowtorzen.contains(liczba)){
                liczba = (int)(Math.random()*10+1);
            }


            listaLosowychBezPowtorzen.add(liczba);
        }

        System.out.println(listaLosowychBezPowtorzen);

        /*
        lista:
        indeksowana
        uporządkowana
        elementy mogą się powtarzać

        zbiór (zazwyczaj):
        nieindeksowany
        nieuporządkowane
        elementy unikatowe
         */

        HashSet <Integer> zbiorLiczbLosowych = new HashSet<>();
        while (zbiorLiczbLosowych.size()<6){
            liczba = (int)(Math.random()*10);
            zbiorLiczbLosowych.add(liczba);
        }
        System.out.println(zbiorLiczbLosowych);
    }
}