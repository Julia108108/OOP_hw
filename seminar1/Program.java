package seminar1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        int a = 1;
        Product product1;

        product1 = new Product("ООО Лучшая вода", "Бу", -100.12);
        //product1.brand = "ООО Лучшая вода";
        //product1.name = "Бутылка с водой";
        //product1.price = -50;
        //product1.name = "A";
        System.out.println(product1.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater();
        BottleOfWater bottleOfWater2 = new BottleOfWater();

        BottleOfWater bottleOfWater3 = new BottleOfWater();

        BottleOfWater bottleOfWater4 = new BottleOfWater();

        System.out.println(bottleOfWater1.displayInfo());
        BottleOfMilk bottleOfMilk1 = new BottleOfMilk();
        System.out.println(bottleOfMilk1.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater4);
        products.add(bottleOfWater3);

        VendingMachine vendingMachine = new VendingMachine();
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(2);
        if (bottleOfWaterResult != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }
    }

}
