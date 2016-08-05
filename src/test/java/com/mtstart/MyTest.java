package com.mtstart;

import org.junit.Test;

import java.util.Random;

/**
 * Created by ll on 2016/8/5.
 */
public class MyTest {


    @Test
    public void testA() {
        Random random = new Random();
        for (int i=0; i<10; i++) {
            System.out.println(random.nextInt(10));
        }
    }
}
