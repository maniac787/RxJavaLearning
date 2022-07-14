package com.nwi.rxjavaudemy.section4;

import io.reactivex.Observable;
import io.reactivex.observables.GroupedObservable;

public class L44GroupByOperator {
    public static void main(String[] args) {
        Observable<String> colors = Observable.just("black", "green", "yellow", "brown", "purple", "blue", "gray", "coral", "corn");
        Observable<GroupedObservable<Character, String>> groups = colors.groupBy(s -> s.charAt(0));
        groups.flatMapSingle(g -> g.toSortedList())
                .subscribe(System.out::println);

        groups.flatMapSingle(g -> g.reduce("", (x, y) -> x.equals("") ? y : x + ", " + y).map(s -> g.getKey() + ":" + s))
                .subscribe(System.out::println);

    }
}
