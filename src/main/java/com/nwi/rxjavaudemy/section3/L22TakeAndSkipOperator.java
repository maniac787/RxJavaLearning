package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

public class L22TakeAndSkipOperator {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("alpha", "beta", "zeta", "omega");

        source.first("lif").subscribe(System.out::println);
    }
}
