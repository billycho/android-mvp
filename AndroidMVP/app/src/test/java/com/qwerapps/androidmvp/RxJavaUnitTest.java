package com.qwerapps.androidmvp;

import org.junit.Test;

import io.reactivex.Observable;

import static org.junit.Assert.assertTrue;


/**
 * Created by IT02106 on 18/04/2018.
 */

public class RxJavaUnitTest {
    String result="";

    // Simple subscription to a fix value
    @Test
    public void returnAValue(){
        result = "";
        Observable<String> observer = Observable.just("Hello"); // provides datea
        observer.subscribe(s -> result=s); // Callable as subscriber
        assertTrue(result.equals("Hello"));
    }
}
