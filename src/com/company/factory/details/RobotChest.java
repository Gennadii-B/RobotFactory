package com.company.factory.details;
import com.company.factory.interfaces.Chest;

import static com.company.factory.details.SOP.println;
/**
 * Created by N on 06.11.2016.
 */
public class RobotChest implements Chest {
    @Override
    public void conductor() {
        println("робот в рабочем сопряжении со всеми частями, " +
                "все эл. узлы  в норме");
    }

    @Override
    public void mounting() {
        println("робот в рабочем сопряжении со всеми частями, " +
                "все чати смонтированы корректно");
    }

    @Override
    public void battery() {
        println("робот в рабочем состоянии, " +
                "заряд батареи удовлетворительный");
    }

    @Override
    public void test() {
        println("основной корпус установлен, тест прошел успешно");
    }
}
