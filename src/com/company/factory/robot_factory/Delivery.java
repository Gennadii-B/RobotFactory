package com.company.factory.robot_factory;
import com.company.factory.producers.*;

import java.util.ArrayList;

/**
 * Created by N on 06.11.2016.
 * класс наполняющий склады производства комплектующими
 */
class Delivery {
    ProducersCreate producers = ProducersCreate.getInstance();

    Samsung samsung = producers.getSamsung();
    Sony sony = producers.getSony();
    Scarlett scarlett = producers.getScarlett();


    public void refillSamsung(ArrayList legs, ArrayList arms, ArrayList chest, ArrayList head) {
        for(int i = 0; i < 3; i++) {
            legs.add(samsung.createLegs());
            arms.add(samsung.createArms());
            chest.add(samsung.createChest());
            head.add(samsung.createHead());
        }
    }

    public void refillSony(ArrayList legs, ArrayList arms, ArrayList chest, ArrayList head) {
        for(int i = 0; i < 3; i++) {
            legs.add(sony.createLegs());
            arms.add(sony.createArms());
            chest.add(sony.createChest());
            head.add(sony.createHead());
        }
    }

    public void refillScarlett(ArrayList legs, ArrayList arms, ArrayList chest, ArrayList head) {
        for(int i = 0; i < 3; i++) {
            legs.add(scarlett.createLegs());
            arms.add(scarlett.createArms());
            chest.add(scarlett.createChest());
            head.add(scarlett.createHead());
        }
    }
}
