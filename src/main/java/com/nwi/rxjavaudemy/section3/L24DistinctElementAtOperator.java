package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

public class L24DistinctElementAtOperator {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("alpha", "alpha", "beta", "zeta", "omega");
//        source.distinct(String::length). // tamanio de la cadena
        source.elementAt(2)
                .subscribe(System.out::println);
    }
}
