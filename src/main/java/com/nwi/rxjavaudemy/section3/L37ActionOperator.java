package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

public class L37ActionOperator {
    public static void main(String[] args) {
        Observable.just(1, 8, 6, 7, 0, 9, 3)
                .doOnNext(e -> System.out.println("element is comming" + e))
                .doOnComplete(() -> System.out.println("You are almost there"))
                .doOnError(e -> System.out.println("division is failed"))
                .map(i -> 5 / i)
                .subscribe(System.out::println);
    }
}
