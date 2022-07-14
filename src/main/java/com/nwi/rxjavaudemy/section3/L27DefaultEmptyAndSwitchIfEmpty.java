package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

public class L27DefaultEmptyAndSwitchIfEmpty {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("alpha", "beta");
        source.defaultIfEmpty("aa").map(i -> i.length()).subscribe(System.out::println);

//      item
        Observable.empty().defaultIfEmpty("Item").subscribe(System.out::println);
//      lista
        Observable.empty().switchIfEmpty(source).subscribe(System.out::println);
    }
}
