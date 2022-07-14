package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

public class L30RepeatAndScanOperator {
    public static void main(String[] args) {
        Observable<Integer> source = Observable.just(1, 5, 9, 7, 6, 3, 45, 56, 7, 0);
        source.repeat(2).subscribe(System.out::println);
        System.out.println("SCAN anterior item y actual");
        source.scan((total, next) -> total + next).subscribe(System.out::println);
        source.map(e -> e.toString()).scan((total, next) -> total + "" + next).subscribe(System.out::println);
    }
}
