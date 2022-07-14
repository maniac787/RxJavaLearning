package com.nwi.rxjavaudemy.section6;

import com.nwi.rxjavaudemy.SleepUtil;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class L55ParallelizationWithFlatMap {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("black", "white", "orange", "red", "purple").subscribeOn(Schedulers.computation());
        source.flatMap(s -> Observable.just(s).subscribeOn(Schedulers.computation())).subscribe(System.out::println);
        SleepUtil.sleep(3000);
    }
}
