package com.nwi.rxjavaudemy.section5;

import com.nwi.rxjavaudemy.SleepUtil;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class L46Sharing {
    public static void main(String[] args) {
        Observable<Long> source = Observable.interval(1, TimeUnit.SECONDS)
                .publish()
                .autoConnect();

        source.subscribe(i -> System.out.println("Observer 1: " + i));
        SleepUtil.sleep(3000);
        source.subscribe(i -> System.out.println("Observer 2: " + i));
        SleepUtil.sleep(3000);

        System.out.println("REFCOUNT");

        Observable<Long> source1 = Observable.interval(1, TimeUnit.SECONDS)
                .publish()
                .refCount();
        source1.take(3).subscribe(i -> System.out.println("Observer 1: " + i));
        SleepUtil.sleep(3000);
        source1.subscribe(i -> System.out.println("Observer 2: " + i));
        SleepUtil.sleep(3000);
    }
}
