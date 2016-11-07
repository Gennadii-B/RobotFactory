package com.company.factory.robot_factory;
import com.company.factory.interfaces.*;

/**
 * Created by N on 06.11.2016.
 * класс отвечающий за то какие детали будут использованы в создании робота
 */
 class OrderRobot {
    String a, b, c, d;

    public OrderRobot(String answer1, String answer2, String answer3, String answer4){
        a = answer1;
        b = answer2;
        c = answer3;
        d = answer4;
    }

    private Arms needArms;
    private Legs needLegs;
    private Chest needChest;
    private Head needHead;

    public Arms getNeedArms() {
        return needArms;
    }

    public void setNeedArms(Arms needArms) {
        this.needArms = needArms;
    }

    public Legs getNeedLegs() {
        return needLegs;
    }

    public void setNeedLegs(Legs needLegs) {
        this.needLegs = needLegs;
    }

    public Chest getNeedChest() {
        return needChest;
    }

    public void setNeedChest(Chest needChest) {
        this.needChest = needChest;
    }

    public Head getNeedHead() {
        return needHead;
    }

    public void setNeedHead(Head needHead) {
        this.needHead = needHead;
    }
}
