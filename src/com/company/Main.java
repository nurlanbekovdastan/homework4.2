package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        Scanner word = new Scanner(System.in);
        System.out.println("Введите 5 уроков:");
        while (listA.size() < 5) {
            String s1 = word.nextLine();
            listA.add(s1);
        }
        info(listA);
        System.out.println("_________");


        ArrayList<String> listB = new ArrayList<>();
        Scanner word1 = new Scanner(System.in);
        System.out.println("Теперь введите 5 имен учителей:");
        while (listB.size() < 5) {
            String s1 = word1.nextLine();
            listB.add(s1);
        }
        info(listB);
        System.out.println("__________");

        ArrayList<String> listC = new ArrayList<>();
        Collections.reverse(listB);
        Iterator<String> iterator = listB.iterator();

        while (iterator.hasNext()) {

            Iterator<String> iterator1 = listA.iterator();

            while (iterator1.hasNext()) {
                listC.add(iterator1.next());
                iterator1.remove();
                break;
            }
            listC.add(iterator.next());
        }
        System.out.println(listC);
        System.out.println("сортировка");

        listC.sort(Comparator.comparing(String::length));

        System.out.println(listC);
        System.out.println("_________");


    }
    public static void info(ArrayList<String> arrayList){
        System.out.println("_________");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}


