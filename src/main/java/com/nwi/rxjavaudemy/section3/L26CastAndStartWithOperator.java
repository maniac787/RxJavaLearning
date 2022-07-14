package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

public class L26CastAndStartWithOperator {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("alpha", "beta", "zeta", "omega");
//        source.cast(Object.class);
        source.startWith("here are your emission").subscribe(System.out::println);
    }
}
