package com.nwi.rxjavaudemy.section4;

import com.nwi.rxjavaudemy.SleepUtil;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class L42AmbiguosAndZipping {
    public static void main(String[] args) {
        Observable<Long> source1 = Observable.interval(1, TimeUnit.SECONDS);
        Observable<Long> source2 = Observable.interval(300, TimeUnit.MILLISECONDS);
        Observable.ambArray(source1, source2)
                .subscribe(System.out::println);
        SleepUtil.sleep(5000);


        Observable<String> source3 = Observable.just("Alpha", "Beta", "Gamma", "Delta");
        Observable<String> source4 = Observable.just("Epsilon", "Zeta");
        Observable.zip(source3, source4, (e1, e2) -> e1 + "-" + e2)
                .subscribe(System.out::println);
    }
}
