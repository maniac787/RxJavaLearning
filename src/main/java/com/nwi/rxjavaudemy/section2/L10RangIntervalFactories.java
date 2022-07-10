package com.nwi.rxjavaudemy.section2;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class L10RangIntervalFactories {
    public static void main(String[] args) {
        Observable.interval(200, TimeUnit.MILLISECONDS).subscribe(System.out::println);
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Observable.range(0, 15).subscribe(System.out::println);

    }
}
