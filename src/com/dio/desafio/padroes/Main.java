package com.dio.desafio.padroes;

import com.dio.desafio.padroes.facade.Facade;
import com.dio.desafio.padroes.singleton.SingletonEager;
import com.dio.desafio.padroes.singleton.SingletonLazy;
import com.dio.desafio.padroes.singleton.SingletonLazyHolder;
import com.dio.desafio.padroes.strategy.*;

public class Main {
    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Strategy

        Behavior defensive = new DefensiveBehavior();
        Behavior normal = new NormalBehavior();
        Behavior aggressive = new AggressiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.move();
        robot.move();

        robot.setBehavior(defensive);
        robot.move();

        robot.setBehavior(aggressive);
        robot.move();
        robot.move();

        // Facade

        Facade facade = new Facade();
        facade.migrateClient("Alexandre", "14310320");
    }
}
