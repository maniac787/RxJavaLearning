package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

public class L33ToListToMapOperator {
    public static void main(String[] args) {
        Observable.just("a", "b", "c", "ab")
                .subscribe(System.out::println);

        Observable.just("a", "b", "c", "ab")
                .toList()
                .subscribe(System.out::println);

        Observable.just("a", "b", "c", "ab")
                .toSortedList()
                .subscribe(System.out::println);

        Observable.just("a", "b", "c", "ab")
                .toMap(String::length)
                .subscribe(System.out::println);

        Observable.just("a", "b", "c", "ab")
                .toMultimap(String::length)
                .subscribe(System.out::println);
    }
}
