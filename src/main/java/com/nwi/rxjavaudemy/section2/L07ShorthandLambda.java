package com.nwi.rxjavaudemy.section2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class L07ShorthandLambda {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("Uno", "Dos", "Tres");

        source.subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Operation completed"));
    }
}
