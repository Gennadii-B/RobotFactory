package com.company;

import com.company.factory.details.ReadyRobot;
import com.company.factory.robot_factory.*;

public class Main {

    public static void main(String[] args) throws Exception {
        while(true) {
            AssemblyLine line = new AssemblyLine();
            line.init();
            ReadyRobot andy = line.assemblyAndTesting();
            andy.TestAll();
        }
    }
}
