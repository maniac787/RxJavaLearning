package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class L25TransformingWithMapOperator {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("alpha", "beta");
        source.map(i -> i + 1).subscribe(System.out::println);
        sleep(1000);
    }

    public static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
