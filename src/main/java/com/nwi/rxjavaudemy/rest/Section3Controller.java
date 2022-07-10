package com.nwi.rxjavaudemy.rest;

import com.nwi.rxjavaudemy.domain.User;
import io.reactivex.Observable;
import io.reactivex.Single;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/section3")
public class Section3Controller {
    @GetMapping("/lista")
    public Observable<ResponseEntity<User>> getList(){
        Observable<User> userObservable = Observable.just(User.builder().id(1L).name("rch").build(), User.builder().id(2L).name("gg").build());
        Single<User> first = userObservable.first(User.builder().build());

        return userObservable.map(ResponseEntity::ok);
    }
}
