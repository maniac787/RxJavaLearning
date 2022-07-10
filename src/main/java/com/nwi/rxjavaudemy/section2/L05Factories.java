package com.nwi.rxjavaudemy.section2;


import io.reactivex.Observable;

public class L05Factories {
    public static void main(String[] args) {
        Observable<String> source = Observable.create(emitter -> {
            try {
                emitter.onNext("Uno");
                emitter.onNext("Dos");
                emitter.onNext("Tres");
                emitter.onComplete();
            } catch (Exception ex) {
                emitter.onError(ex.getCause());
            }
        });
        Observable<String> source2 = Observable.just("Uno", "Dos", "Tres");
    }
}
