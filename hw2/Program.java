package hw2;

public class Program {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Kuzya", 10),
                new Cat("Vasya", 15 ),
                new Cat("Bob", 30)
        };


            Plate plate = new Plate(30);
        plate.info();
        for ( Cat cat : cats) {
            cat.eat(plate);
            System.out.printf("Кот %s\t наелся %b\n", cat.getName(), cat.isSatiety());
    }
        plate.info();
        plate.addFood(100);
        plate.info();
    }
}