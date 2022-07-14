package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

import java.util.HashMap;
import java.util.HashSet;

public class L34CollectOperator {
    public static void main(String[] args) {
        Observable.just("alpha", "beta", "zeta", "omega")
                .toMultimap(i -> i.charAt(0), String::length, HashMap::new)
                .subscribe(System.out::println);

        Observable.just("alpha", "beta", "zeta", "omega")
                .collect(HashSet::new, HashSet::add)
                .subscribe(System.out::println);
    }
}
