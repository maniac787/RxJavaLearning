package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

public class L31ReduceOperator {
    public static void main(String[] args) {
        Observable.just("a", "", "b", "c").reduce((a, b) -> a + (b.equals("") ? "" : "," + b)).subscribe(System.out::println);
        //Diferencia entre scan y reduce
        Observable.just("a", "", "b", "c").scan((a, b) -> a + (b.equals("") ? "" : "," + b)).subscribe(System.out::println);
    }
}
