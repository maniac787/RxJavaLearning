package com.nwi.rxjavaudemy.section2;

import com.nwi.rxjavaudemy.SleepUtil;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

import java.util.concurrent.TimeUnit;

public class L17DisposeUsingDisposable {
    public static void main(String[] args) {
        Observable<Long> source = Observable.interval(1, TimeUnit.SECONDS);
        Disposable disp = source.subscribe(System.out::println);
        SleepUtil.sleep(5000);
        System.out.println("Dispose init");
        disp.dispose();
        System.out.println("Dispose end");
        SleepUtil.sleep(5000);
    }
}
