package pl.sda.kopczynskaizabela.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * http://dominisz.pl
 * 25.03.2018
 */
public class App {

    public static void main(String[] args) {

        // dla ArrayList
        // utworzyć nową listę poprzez dodawanie n losowych elementów na koniec listy
        // utworzyć nową listę poprzez dodawanie n losowych elementów na początek listy
        // przejrzeć całą listę i usunąć wszystkie elementy z listy, ale zawsze usuwając 1szy element listy.

        List<Integer> listArr = new ArrayList<>();
        System.out.println("add front: ");
        ListingUtils.addAtTheFront(listArr, 100000);
        System.out.println("add back: ");
        ListingUtils.addAtTheEnd(listArr, 100000);
        System.out.println("deleting: ");
        ListingUtils.deleteListdeletingFistElement(listArr);

        // dla LinkedList
        // utworzyć nową listę poprzez dodawanie n losowych elementów na koniec listy
        // utworzyć nową listę poprzez dodawanie n losowych elementów na początek listy
        // przejrzeć całą listę i usunąć wszystkie elementy z listy, ale zawsze usuwając 1szy element listy.

        List <Integer> listLink = new LinkedList<>();
        System.out.println("add front: ");
        ListingUtils.addAtTheFront(listLink, 100000);
        System.out.println("add back: ");
        ListingUtils.addAtTheEnd(listLink, 100000);
        System.out.println("deleting: ");
        ListingUtils.deleteListdeletingFistElement(listLink);
    }

}
