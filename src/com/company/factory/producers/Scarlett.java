package com.company.factory.producers;

import com.company.factory.details.*;
import com.company.factory.interfaces.*;

/**
 * Created by N on 06.11.2016.
 */
public class Scarlett implements ScarlettInter {
    Scarlett(){}

    @Override
    public Arms createArms() {
        return new ScarlettArms();
    }

    @Override
    public Chest createChest() {
        return new ScarlettChest();
    }

    @Override
    public Head createHead() {
        return new ScarlettHead();
    }

    @Override
    public Legs createLegs() {
        return new ScarlettLegs();
    }
}
