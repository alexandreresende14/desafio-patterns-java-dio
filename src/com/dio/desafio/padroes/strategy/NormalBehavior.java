package com.dio.desafio.padroes.strategy;

public class NormalBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("Moving normally...");
    }
}
