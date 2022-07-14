package com.nwi.rxjavaudemy.section6;

import com.nwi.rxjavaudemy.SleepUtil;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.time.LocalTime;

public class L52ComputationalScheduler {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("black", "white", "orange", "red", "purple").subscribeOn(Schedulers.computation());
        source.subscribe(s -> System.out.println("Observer 1" + s +" on:" + LocalTime.now()));
        source.subscribe(s -> System.out.println("Observer 2" + s +" on:" + LocalTime.now()));
        SleepUtil.sleep(3000);
    }
}
