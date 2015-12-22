package com.junitSpringTest.service;

import org.springframework.stereotype.Component;

/**
 * Created by XI319411 on 17/12/2015.
 */

@Component
public class Calculo {

    public String pollo(int a, int b){
        int num = a + b;

        return String.valueOf(num);
    }
    public int pollo2(int a, int b){

        return a + b;

    }
}
