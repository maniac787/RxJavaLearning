package com.nwi.rxjavaudemy.section4;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class L43CombineLatestOperator {
    public static void main(String[] args) {
        Observable<Long> source1 = Observable.interval(1, TimeUnit.SECONDS);
        Observable<Long> source2 = Observable.interval(300, TimeUnit.MILLISECONDS);
//        Observable.zip(source1, source2, (e1, e2)-> "source1: "+ e1 + " -" +" source2: " + e2)
//                        .subscribe(System.out::println);

        System.out.println("Combine\n");
        Observable.combineLatest(source1, source2, (e1, e2)-> "source1: "+ e1 + "-" +" source2: " + e2)
                .subscribe(System.out::println);

        source1.withLatestFrom(source2, (e1, e2)-> "source1: "+ e1 + "-" +" source2: " + e2);
        sleep(5000);

    }

    public static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
