package com.nwi.rxjavaudemy;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class L06ObserverInterface {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("Uno", "Dos", "Tres");
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull String s) {
                System.out.println(s);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                System.out.println(e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("La operacion de impresion esta completa");
            }
        };

        source.subscribe(observer);
    }
}
