package pl.sda.kopczynskaizabela.collections;

import java.util.List;
import java.util.Random;

import static java.lang.System.currentTimeMillis;

public class ListingUtils {

    private static Random rand = new Random();

    public static void addAtTheFront(List <Integer> list, int n){
        long startTime = currentTimeMillis();
        for(int i = 0 ; i < n; i++){
            int number = rand.nextInt(100);
            list.add(0, number);
        }
        long endTime = currentTimeMillis();
        long timeMillis = endTime - startTime;
        System.out.println(timeMillis);
    }

    public static void addAtTheEnd(List <Integer> list, int n){
        long startTime = currentTimeMillis();
        for(int i = 0 ; i < n; i++){
            int number = rand.nextInt(100);
            list.add(number);
        }
        long endTime = currentTimeMillis();
        long timeMillis = endTime - startTime;
        System.out.println(timeMillis);
    }

    public static void deleteListdeletingFistElement(List <Integer> list){
        long startTime = currentTimeMillis();
        for(int i = 0; i < list.size(); i ++){
            list.remove(0);
        }

        long endTime = currentTimeMillis();
        long timeMillis = endTime - startTime;
        System.out.println(timeMillis);
    }
}
