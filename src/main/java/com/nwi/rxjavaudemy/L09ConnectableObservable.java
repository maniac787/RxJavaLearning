package com.nwi.rxjavaudemy;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

import java.util.Arrays;
import java.util.List;

public class L09ConnectableObservable {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("jack", "tim", "Maria", "Jackeline");
        Observable<String> source = Observable.fromIterable(list);
        ConnectableObservable<String> hot = source.publish();

        hot.subscribe(e -> System.out.println("observer 1 " + e));
        hot.subscribe(e -> System.out.println("observer 2 " + e));
        hot.connect();
    }
}
