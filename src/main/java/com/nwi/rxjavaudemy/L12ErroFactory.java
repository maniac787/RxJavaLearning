package com.nwi.rxjavaudemy;

import io.reactivex.Observable;

public class L12ErroFactory {
    public static void main(String[] args) {
        Observable.error(new Exception("crash")).subscribe(System.out::println, Throwable::printStackTrace, ()->System.out.println("done"));

    }
}
