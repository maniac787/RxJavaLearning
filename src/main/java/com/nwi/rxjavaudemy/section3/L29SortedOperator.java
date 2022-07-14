package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public class L29SortedOperator {
    public static void main(String[] args) {
        Observable<Integer> source = Observable.just(1, 5, 9, 7, 6, 3, 45, 56, 7, 0);
        source.sorted(Comparator.reverseOrder()).subscribe(System.out::println);
    }
}
