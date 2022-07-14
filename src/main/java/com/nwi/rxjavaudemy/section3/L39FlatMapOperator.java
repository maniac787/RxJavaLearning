package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

public class L39FlatMapOperator {
    public static void main(String[] args) {
        Observable<String> source1 = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Zeta");
        source1.flatMap(s -> Observable.fromArray(s.split(""))).subscribe(System.out::println);
    }
}
