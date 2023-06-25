package hw6;

import java.io.File;

public class Program {
    /**
     Оптимизировать работу класса Order в  рамках принципа SRP
     */
    public static void main(String[] args) {
        Order order = new Order("Vasya", "Phone", 2,500);
        Saver saver = new Saver();
        Loader loader = new Loader();
        saver.saveToJson(order);
        saver.saveToXML(order);
        saver.saveToTxt(order);
        Order order1 = new Order();
        loader.loadFromJson(new File("OOP/hw6/order.json"), order1);
        System.out.println(order1);
    }
}