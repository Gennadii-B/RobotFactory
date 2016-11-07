package com.company.factory.details;

import static com.company.factory.details.SOP.println;
/**
 * Created by N on 07.11.2016.
 */
public class SamsungArms extends RobotArms {

    @Override
    public void test() {
        println("Руки производства Samsung закреплена в пазах, все контакты в норме \n" +
                "работа корректна.");
    }
}
