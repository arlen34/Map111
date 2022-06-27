package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        HashMap<String , Dog> map = new HashMap<>();
        map.put("Nala",new Dog(2,"G2","White"));
        map.put("Bendi",new Dog(3,"G1","Black"));
        map.put("Simbo",new Dog(1,"G1","Blue"));

        map.entrySet().forEach(System.out::println);//либо это
        System.out.println();
        map.entrySet().stream().toList().forEach(System.out::println);//лиюо это



















//        arrayList.forEach(System.out::println);
//        arrayList.stream().peek().forEach(System.out::println);
    }
}
