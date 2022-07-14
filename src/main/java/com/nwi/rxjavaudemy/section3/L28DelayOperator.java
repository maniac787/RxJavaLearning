package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class L28DelayOperator {
    public static void main(String[] args) {
        Observable<Integer> source = Observable.just(1, 5, 9, 7, 6, 3, 45, 56, 7, 0);
        source.delay(5, TimeUnit.SECONDS).subscribe(System.out::println);
        sleep(10000);

    }

    public static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
