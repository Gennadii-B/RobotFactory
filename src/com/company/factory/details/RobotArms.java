package com.company.factory.details;
import com.company.factory.interfaces.Arms;

import static com.company.factory.details.SOP.println;
/**
 * Created by N on 06.11.2016.
 */
public class RobotArms implements Arms {
    @Override
    public void take() {
        println("робот берет");
    }

    @Override
    public void equilibrium() {
        println("робот держит равновесие используя руки");
    }

    @Override
    public void gesture() {
        println("робот показывает жест");
    }

    @Override
    public void test() {
        println("руки установлены, тест рефлексов удовлетворительный");
    }
}
