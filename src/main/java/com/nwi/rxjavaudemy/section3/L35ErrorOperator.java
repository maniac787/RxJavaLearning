package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

public class L35ErrorOperator {
    public static void main(String[] args) {
        Observable.just(1, 8, 6, 7, 0, 9, 3)
                .map(i -> 5 / i).onErrorReturnItem(-1)
                .subscribe(System.out::println);

        Observable.just(1, 8, 6, 7, 0, 9, 3)
                .map(i -> 5 / i)
                .onErrorResumeNext(Observable.just(5, 6, 7))
                .subscribe(System.out::println);
    }
}
