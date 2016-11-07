package com.company.factory.producers;
import com.company.factory.details.*;
import com.company.factory.interfaces.*;

/**
 * Created by N on 06.11.2016.
 */
public class Sony  implements SonyInter {
    Sony(){}

    @Override
    public Arms createArms() {
        return new SonyArms();
    }

    @Override
    public Chest createChest() {
        return new SonyChest();
    }

    @Override
    public Head createHead() {
        return new SonyHead();
    }

    @Override
    public Legs createLegs() {
        return new SonyLegs();
    }
}