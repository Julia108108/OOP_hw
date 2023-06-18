package hw2;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(FoodKeeper foodKeeper) {
        if (!this.satiety && foodKeeper.getFood() >= this.appetite) {
            this.satiety = true;
            foodKeeper.setFood(foodKeeper.getFood() - this.appetite);
        }
    }
}


