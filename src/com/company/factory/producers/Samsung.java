package com.company.factory.producers;

import com.company.factory.details.*;
import com.company.factory.interfaces.*;

/**
 * Created by N on 06.11.2016.
 */
public class Samsung implements SamsungInter {
    Samsung(){}

    @Override
    public Arms createArms() {
        return new SamsungArms();
    }

    @Override
    public Chest createChest() {
        return new SamsungChest();
    }

    @Override
    public Head createHead() {
        return new SamsungHead();
    }

    @Override
    public Legs createLegs() {
        return new SamsungLegs()
                ;
    }
}
