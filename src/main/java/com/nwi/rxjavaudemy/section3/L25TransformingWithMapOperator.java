package com.nwi.rxjavaudemy.section3;

import com.nwi.rxjavaudemy.SleepUtil;
import io.reactivex.Observable;

public class L25TransformingWithMapOperator {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("alpha", "beta");
        source.map(i -> i + 1).subscribe(System.out::println);
        SleepUtil.sleep(1000);
    }
}
