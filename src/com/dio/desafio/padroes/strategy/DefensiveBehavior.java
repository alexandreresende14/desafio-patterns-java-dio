package com.dio.desafio.padroes.strategy;

public class DefensiveBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Moving defensively...");
    }
}
