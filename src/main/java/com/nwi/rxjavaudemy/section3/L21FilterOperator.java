package com.nwi.rxjavaudemy.section3;

import com.nwi.rxjavaudemy.domain.User;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class L21FilterOperator {
    public static void main(String[] args) {

        List<String> sourceList = List.of("alpha", "beta", "zeta", "Omega");
        sourceList.stream().filter(e -> e.length() > 4).peek(e->{System.out.println(e);}).collect(Collectors.toList());

        Observable<String> source = Observable.just("alpha", "beta", "zeta", "Omega");
        source.filter(e -> e.length() > 10).first("asd").subscribe(System.out::println);
        System.out.println("Fin");

        Observable<User> userObservable = Observable.just(User.builder().id(1L).name("rch").build(), User.builder().id(2L).name("gg").build());
        Single<User> first = userObservable.first(User.builder().build());
        Completable.fromSingle(first.map(e -> User.builder().id(e.getId()).build()));

        first.subscribe(e -> {
            System.out.println(e);
        });

    }

    public static void sleep(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
