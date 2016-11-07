package com.company.factory.producers;

/**
 * Created by N on 06.11.2016.
 */
public class ProducersCreate {

    private static ProducersCreate ourInstance = new ProducersCreate();

    public static ProducersCreate getInstance() {
        return ourInstance;
    }

    private ProducersCreate() {

    }
    private static Samsung samsung = new Samsung();
    private static Scarlett scarlett = new Scarlett();
    private static Sony sony = new Sony();

    public static Samsung getSamsung(){return samsung;}
    public static Scarlett getScarlett(){return scarlett;}
    public static Sony getSony(){return sony;}


}
