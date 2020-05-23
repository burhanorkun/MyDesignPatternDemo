package com.orkun.state.exercise;

public class Main {

    public static void main(String[] args) {
        var service = new DirectionService(new Bicyling());
        service.getEta();
        service.getDirection();
    }
}
