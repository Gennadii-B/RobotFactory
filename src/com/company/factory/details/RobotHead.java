package com.company.factory.details;
import com.company.factory.interfaces.Head;

import static com.company.factory.details.SOP.println;
/**
 * Created by N on 06.11.2016.
 */
public class RobotHead implements Head {
    @Override
    public void vision() {
        println("робот видит");
    }

    @Override
    public void dataProcessing() {
        println("робот обробатывает информацию");
    }

    @Override
    public void interaction() {
        println("робот следит за корректной работой рук и ног");
    }

    @Override
    public void test() {
        println("голова зафиксирована и зрительный тест пройден успешно");
    }
}
