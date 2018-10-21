package com.sda.kolekcje;

import java.util.ArrayList;
import java.util.List;

// zajecia 21.10

public class Main {

    public static void main(String[] args) {

        // typy generyczne- poczytac

        //tworzymy nowa liste typu array list
        // arraylist implementuje list
        // tak wiec mozemy przypisac = interfejs list
        List<String> lista = new ArrayList<>();

        //dodajemy element do listy
        lista.add("Jan");
        lista.add("Maciej");
        lista.add("Tadeusz");

        // sprawdzamy rozmiar listy- wyswietli 3
        System.out.println("Rozmiar: " + lista.size());

        lista.add("Mateusz");
        lista.add("Karol");

        // sprawdzamy rozmiar listy- wyswietli 5
        System.out.println("Rozmiar: " + lista.size());

        // iterujemy po liscie- petla for each
        for (String imie : lista) {
            System.out.println("Imie: " + imie);
        }

        // jesli nie ma iteratora w lisice to uzywamy standardowej petli
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Imie z petli drugiej " + lista.get(i));
        }

        // usuwamy elementy z listy
        lista.remove("Jan");
        lista.remove("0");

        // Pobieramy cos z listy
        String imie = lista.get(2);
        System.out.println("Element o indeksie 2: " + imie);

        // wyswietlamy elementy kolekcji
        System.out.println(lista);
        //usuwamy elementy z listy
        lista.clear();
        System.out.println(lista);

        // zabezpieczamy sie przed bledem
        try {
            String imie1 = lista.get(1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("za daleko");
            //e.printStackTrace();
        }


        // towrzymy kilka obiektow klasy user. Mamy to dzieki kontruktorowi
        User Tadek = new User("Tadek", "Tadzinski", 12);
        User Franek = new User("Franek", "Frankowski", 77);
        User Janek = new User("Janek", "Jankowski", 99);

        // tworzymy arrayList typu User w <> jest klasa czy tam typ
        List<User> listaUserow = new ArrayList<>();

        // dodajemy do listy stworzone obiekty klasy user
        listaUserow.add(Tadek);
        listaUserow.add(Franek);
        listaUserow.add(Janek);

        // iterujemy sie po liscie wywietlajac ich dane
        for (User imionaUserow : listaUserow) {
            System.out.println("Imie: " + imionaUserow.getName() + " Nazwisko: " + imionaUserow.getLastname() + " Wiek: " + imionaUserow.getAge());
        }
        listaUserow.clear();
        System.out.println(listaUserow);



    }
}

