package com.nwi.rxjavaudemy.section2;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

import java.util.concurrent.TimeUnit;

public class L19CompositeDisposable {
    private static final CompositeDisposable disposables = new CompositeDisposable();

    public static void main(String[] args) {
        Observable<Long> seconds = Observable.interval(1, TimeUnit.SECONDS);

        Disposable disposable1 = seconds.subscribe(l -> System.out.println("Observer 1: "+ +l));
        Disposable disposable2 = seconds.subscribe(l -> System.out.println("Observer 2: "+ +l));

        disposables.addAll(disposable1, disposable2);
        disposables.dispose();
    }
}
