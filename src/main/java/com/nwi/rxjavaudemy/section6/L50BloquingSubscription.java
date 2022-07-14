package com.nwi.rxjavaudemy.section6;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class L50BloquingSubscription {
    public static void main(String[] args) {
        //Uso en testing
        Observable.interval(1, TimeUnit.SECONDS)
                .take(10)
                .blockingSubscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Observer 1 done!"));


        Observable.interval(12000, TimeUnit.MICROSECONDS)
                .take(5)
                .blockingSubscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Observer 2 done!"));

    }
}
