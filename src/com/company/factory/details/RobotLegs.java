package com.company.factory.details;
import com.company.factory.interfaces.Legs;

import static com.company.factory.details.SOP.println;
/**
 * Created by N on 06.11.2016.
 */
public class RobotLegs implements Legs {
    @Override
    public void Run() {
        println("робот бежит");
    }

    @Override
    public void walk() {
        println("робот идет");
    }

    @Override
    public void jump() {
        println("робот прыгает");
    }

    @Override
    public void test() {
        println("ноги вставлены в корпус, тест прошел успешно");
    }
}
