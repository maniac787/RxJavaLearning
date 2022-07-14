package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

public class L32OtherReducingOperator {
    public static void main(String[] args) {
        Observable.just("a", "", "b", "c", "ab", "123")
                .all(i -> i.length() == 1)
                .subscribe(System.out::println);
        Observable.just("a", "", "b", "c", "ab", "123")
                .any(i -> i.length() == 1)
                .subscribe(System.out::println);

        System.out.println("Elementos en el stream");
        Observable.just("a", "", "b", "c", "ab", "123")
                .count()
                .subscribe(System.out::println);

        Observable.just("a", "", "b", "c", "ab", "123")
                .contains("123")
                .subscribe(System.out::println);
    }
}
