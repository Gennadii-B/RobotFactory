package com.company.factory.interfaces;

import com.company.factory.details.*;

/**
 * Created by N on 07.11.2016.
 */
public interface Robot {

    RobotChest CHEST();
    RobotHead HEAD();
    RobotArms ARMS();
    RobotLegs LEGS();

}
