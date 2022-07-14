package com.nwi.rxjavaudemy.section3;

import io.reactivex.Observable;

import java.util.List;

public class L23TakeSkipWhile {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("alpha", "beta", "zeta", "omega");
//        desde el inicio del stream inicia el predicado
        source.takeWhile(e -> e.length() > 4).subscribe(System.out::println);
        System.out.println("TakeUntil");
        source.takeUntil(e -> e.length() > 4).subscribe(System.out::println);
        System.out.println("\n ---FIN--- \n");
        source.skipWhile(e -> e.length() > 4).subscribe(System.out::println);
    }
}
