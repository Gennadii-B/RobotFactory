package com.company.factory.robot_factory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static com.company.factory.details.SOP.print;
import static com.company.factory.details.SOP.println;

/**
 * Created by N on 06.11.2016.
 * класс отвечающий за диалог с клиентом, возвращает информацию для оформления заказа
 */
 class Dialog {
    private static Dialog ourInstance = new Dialog();
    public static Dialog getInstance() {
        return ourInstance;
    }
    private Dialog() {
    }

    public OrderRobot dialog() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        println("");
        println("Вы в меню создания робота, вам необходимо выбрать производителья \n" +
                "комплектущих из предоставленных. Для выбора вводите цифру производителя: \n" +
                "1. Samsung. \n" +
                "2. Sony. \n" +
                "3. Scarlett");
        print("Основной корпус будет выполнен фирмой: ");
        String answer1 = reader.readLine();

        print("фирма производитель рук: ");
        String answer2 = reader.readLine();

        print("фирма производитель ног: ");
        String answer3 = reader.readLine();

        print("фирма производитель головы: ");
        String answer4 = reader.readLine();
        println("");

        return new OrderRobot(answer1, answer2, answer3, answer4);
    }
}
