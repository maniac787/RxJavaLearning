package com.nwi.rxjavaudemy.section2;

import io.reactivex.Completable;

public class L16CompletableObservable {
    public static void main(String[] args) {
        Completable.fromRunnable(() -> System.out.println("Calling on complete")).subscribe(() -> System.out.println("done!!"));
    }
}
