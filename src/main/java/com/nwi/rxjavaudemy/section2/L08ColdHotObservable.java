package com.nwi.rxjavaudemy.section2;

import io.reactivex.Observable;

import java.util.List;

public class L08ColdHotObservable {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("Uno", "Dos", "Tres");

        source.subscribe(e -> System.out.println("Objserver 1 " + e));
        source.subscribe(e -> System.out.println("Objserver 2 " + e));

        System.out.println("-------From Iterable factory--------");

        List<String> list = List.of("jack", "tim", "Maria", "Jackeline");
        Observable<String> sourceSecond  = Observable.fromIterable(list);
        sourceSecond.subscribe(e -> System.out.println("Objserver 1 " + e));
        sourceSecond.subscribe(e -> System.out.println("Objserver 2 " + e));
    }
}
