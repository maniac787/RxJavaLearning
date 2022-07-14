package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

public class L36RetryOperator {
    public static void main(String[] args) {
        Observable.just(1, 8, 6, 7, 0, 9, 3)
                .map(i -> 5 / i)
                .retry(2)
                .subscribe(System.out::println);
    }
}
