package com.nwi.rxjavaudemy.section2;

import io.reactivex.Observable;

import java.util.concurrent.Future;

public class L11FutureEmptyNeverFactory {
    public static void main(String[] args) {
        Observable.empty();
        Observable.never();

//        Future<String> futureValue = ...;
//        Observable.fromFuture(futureValue).map(String::length).subscribe(System.out::println);
    }
}
