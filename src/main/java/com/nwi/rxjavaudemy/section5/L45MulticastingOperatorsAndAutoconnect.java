package com.nwi.rxjavaudemy.section5;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class L45MulticastingOperatorsAndAutoconnect {
    public static void main(String[] args) {
        ConnectableObservable<Integer> source = Observable.range(1, 3).map(i -> i+5).publish();
        source.subscribe(i -> System.out.println("Observer 1: " + i));
        source.subscribe(i -> System.out.println("Observer 2: " + i));
        source.connect();

        Observable<Integer> source1 = Observable.range(1, 3).map(i -> i+5).publish().autoConnect(2);
        source1.subscribe(i -> System.out.println("Observer 1: " + i));
        source1.subscribe(i -> System.out.println("Observer 2: " + i));
    }
}
