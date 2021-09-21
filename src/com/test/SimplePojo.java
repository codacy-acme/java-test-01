package com.test;

import java.io.*; 
import java.lang.Thread;

class SimplePojo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Thread t = new Thread();
        t.run();            // use t.start() instead
        new Thread().run(); // same violation 
    }
}