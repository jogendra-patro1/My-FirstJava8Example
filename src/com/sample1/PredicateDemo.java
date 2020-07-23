package com.sample1;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer>  p= age -> (age>19);
        int z=0;
       // int result=z/0;
        System.out.println(p.test(21));
        System.out.println(p.test(18));
    }
}
