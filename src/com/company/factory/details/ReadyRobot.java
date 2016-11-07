package com.company.factory.details;

import com.company.factory.interfaces.*;

/**
 * Created by N on 07.11.2016.
 */
public class ReadyRobot {
    Chest chest;
    Head head;
    Arms arms;
    Legs legs;

    ReadyRobot(){}
    public ReadyRobot(Chest chest, Arms arms, Legs legs, Head head){
        this.chest = chest;
        this.head = head;
        this.arms = arms;
        this.legs = legs;
    }

    public void  TestAll(){
        chest.test();
        head.test();
        arms.test();
        legs.test();
    }

}
