package com.company.factory.robot_factory;

import com.company.factory.interfaces.Arms;
import com.company.factory.interfaces.Chest;
import com.company.factory.interfaces.Head;
import com.company.factory.interfaces.Legs;

import java.util.ArrayList;

/**
 * Created by N on 06.11.2016.
 * класс отвечающий за хранение и наполнение склада комплектующими
 */
class Stock {
    private static Stock ourInstance = new Stock();
    public static Stock getInstance() {
        return ourInstance;
    }
    private Stock() {}

    Delivery delivery = new Delivery();
    public void refillAll(){
        delivery.refillSamsung(samsungLegs, samsungArms, samsungChest, samsungHead);
        delivery.refillScarlett(scarlettLegs, scarlettArms, scarlettChest, scarlettHead);
        delivery.refillSony(sonyLegs, sonyArms, sonyChest, sonyHead);
    }


    public static ArrayList<Legs> samsungLegs = new ArrayList<Legs>();
    public static ArrayList<Head> samsungHead = new ArrayList<Head>();
    public static ArrayList<Chest> samsungChest = new ArrayList<Chest>();
    public static ArrayList<Arms> samsungArms = new ArrayList<Arms>();

    public static ArrayList<Legs> scarlettLegs = new ArrayList<Legs>();
    public static ArrayList<Head> scarlettHead = new ArrayList<Head>();
    public static ArrayList<Chest> scarlettChest = new ArrayList<Chest>();
    public static ArrayList<Arms> scarlettArms = new ArrayList<Arms>();

    public static ArrayList<Legs> sonyLegs = new ArrayList<Legs>();
    public static ArrayList<Head> sonyHead = new ArrayList<Head>();
    public static ArrayList<Chest> sonyChest = new ArrayList<Chest>();
    public static ArrayList<Arms> sonyArms = new ArrayList<Arms>();
}
