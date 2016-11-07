package com.company.factory.robot_factory;

import com.company.factory.details.ReadyRobot;

/**
 * Created by N on 06.11.2016.
 * Основная линия сборки робота, он же отвечает за процессы производства
 */
public class AssemblyLine {
    OrderProcessing proc = new OrderProcessing();
    Stock stock = Stock.getInstance();
    OrderRobot order;

    public void init() throws Exception {
        stock.refillAll();
        order = proc.init();
    }

    public ReadyRobot assemblyAndTesting(){
        ReadyRobot robot = new ReadyRobot(order.getNeedChest(),
                order.getNeedArms(), order.getNeedLegs(), order.getNeedHead());


        return robot;

    }

}
