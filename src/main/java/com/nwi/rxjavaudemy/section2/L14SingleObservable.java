package com.nwi.rxjavaudemy.section2;

import io.reactivex.Observable;

public class L14SingleObservable {
    public static void main(String[] args) {
        Observable.just("a", "b").first("lif").subscribe(System.out::println);
    }
}
