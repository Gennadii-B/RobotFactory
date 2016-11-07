package com.company.factory.robot_factory;

/**
 * Created by N on 06.11.2016.
 * класс обробатывает запрос заказчика и возвращает заказ чеез метод
 */
 class OrderProcessing  {
    Dialog dialog = Dialog.getInstance();
    OrderRobot order;
    Stock stock = Stock.getInstance();

    public OrderRobot init() throws Exception {
        order = dialog.dialog();
        if(order.a.equals("1"))order.setNeedChest(stock.samsungChest.get(0));
        else if(order.a.equals("2"))order.setNeedChest(stock.sonyChest.get(0));
        else if(order.a.equals("3"))order.setNeedChest(stock.scarlettChest.get(0));

        if(order.b.equals("1"))order.setNeedArms(stock.samsungArms.get(0));
        else if(order.b.equals("2"))order.setNeedArms(stock.sonyArms.get(0));
        else if(order.b.equals("3"))order.setNeedArms(stock.scarlettArms.get(0));

        if(order.c.equals("1"))order.setNeedLegs(stock.samsungLegs.get(0));
        else if(order.c.equals("2"))order.setNeedLegs(stock.sonyLegs.get(0));
        else if(order.c.equals("3"))order.setNeedLegs(stock.scarlettLegs.get(0));

        if(order.d.equals("1"))order.setNeedHead(stock.samsungHead.get(0));
        else if(order.d.equals("2"))order.setNeedHead(stock.sonyHead.get(0));
        else if(order.d.equals("3"))order.setNeedHead(stock.scarlettHead.get(0));

        return order;
    }


}
