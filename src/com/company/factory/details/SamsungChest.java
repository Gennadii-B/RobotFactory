package com.company.factory.details;

import static com.company.factory.details.SOP.println;
/**
 * Created by N on 07.11.2016.
 */
public class SamsungChest extends RobotChest {
    @Override
    public void test() {
        println("Крепкий корпус робота производства Samsung, \n" +
                "готов к установке вспомогательных деталей");
    }
}
