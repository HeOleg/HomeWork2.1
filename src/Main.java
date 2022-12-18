public class Main {

    private static void calculate(Flower[] bouquet){
        double sum = 0;
        int lifeSpan = Integer.MAX_VALUE;
        String text = "В букет входит: \n";
        for (Flower flower : bouquet) {
            if (flower != null) {
                if (flower.getLifeSpan() < lifeSpan) {
                    lifeSpan = flower.getLifeSpan();
                }
            }
            sum += flower.getCost();
            text += flower.getName() + "\n";

        }
        sum = sum * 1.10;
        System.out.println(text);

        System.out.println("Стоимость букета: " + String.format("%.2f",sum) + " рублей." );
        System.out.println("Время стояния букета: " + lifeSpan + " дней.");
    }


    public static void main(String[] args) {

        Human maksim = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        Human anna = new Human("Анна", 1993, "Москва", "методист образовательных программ");
        Human katya = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артём", 1995, "Москва", "директор по развитию бизнеса");

        System.out.println(maksim);
        System.out.println(anna);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(anna);
        System.out.println();


        Flower roseOrdinary = new Flower("Роза обыкновенная", null, "Голландия", 35.59, 0);

        Flower chrysanthemum = new Flower("Хризантема", null, null, 15, 5);

        Flower pion = new Flower("Пион", null, "Англия", 69.9, 1);

        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);


        System.out.println(roseOrdinary);
        System.out.println(chrysanthemum);
        System.out.println(pion);
        System.out.println(gypsophila);
        System.out.println();

        Flower[] bouquet = new Flower[9];
        bouquet[0] = roseOrdinary;
        bouquet[1] = roseOrdinary;
        bouquet[2] = roseOrdinary;
        bouquet[3] = chrysanthemum;
        bouquet[4] = chrysanthemum;
        bouquet[5] = chrysanthemum;
        bouquet[6] = chrysanthemum;
        bouquet[7] = chrysanthemum;
        bouquet[8] = gypsophila;
        calculate(bouquet);



    }
}