package com.vit.demo;

public class AppTest {

    public static void main(String[] args) {
        int expected = 5;
        int actual = App.add(2, 3);

        if (actual != expected) {
            throw new RuntimeException("Test failed: expected " + expected + " but received " + actual);
        }

        System.out.println("TEST PASSED: App.add(2, 3) returned " + actual + ".");
    }
}
