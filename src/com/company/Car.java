package com.company;

public class Car implements AutoCloseable{
    public Car() {

    }

    @Override
    public void close() throws Exception {
        System.out.println("Mashina jabylyp jatat");
    }
    public void drive(){
        System.out.println("Mashina jurup bara jatat");
    }
}
