package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

public class L40ConcatAndConcatWithOperator {
    public static void main(String[] args) {
        Observable<String> source1 = Observable.just("Alpha", "Beta");
        Observable<String> source2 = Observable.just("Gamma", "Delta");
        Observable.concat(source1, source2).subscribe(System.out::println);
        System.out.println("\n");
        source1.concatWith(source2).subscribe(System.out::println);

    }
}
