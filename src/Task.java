public class Task {
    public static void main(String[] args) {
        int money = 1000;
        int pizzaPrice = 230;
        int gymPrice = 26;
        double candyPrice = 2.5;
        int howManyPizza = money / pizzaPrice; // 4
        int moneyAfterPizza = money % pizzaPrice; // 80
        int howManyGym = moneyAfterPizza / gymPrice; // 80 / 26 = 3 (2)
        int moneyAfterGym = moneyAfterPizza % gymPrice; // 2
        int howManyCandies = (int) (moneyAfterGym / candyPrice);
        double moneyResult = moneyAfterGym % candyPrice;
        System.out.println("Пиццы купили " + howManyPizza);
        System.out.println("Жевачки купили " + howManyGym);
        System.out.println("Конфет купили " + howManyCandies);
        System.out.println("Осталось " + moneyResult);

    }
}
