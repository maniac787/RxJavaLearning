package com.nwi.rxjavaudemy.section2;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

import java.util.concurrent.TimeUnit;

public class L17DisposeUsingDisposable {
    public static void main(String[] args) {
        Observable<Long> source = Observable.interval(1, TimeUnit.SECONDS);
        Disposable disp = source.subscribe(System.out::println);
        sleep(5000);
        System.out.println("Dispose init");
        disp.dispose();
        System.out.println("Dispose end");
        sleep(5000);
    }

    public static void sleep(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
