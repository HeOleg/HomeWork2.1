public class Main {


    public static void main(String[] args) {

        Human maksim = new Human("", 35, "Минск","бренд-менеджер");
        Human anna = new Human("Анна", 29, "Москва", "методист образовательных программ");
        Human katya = new Human("Катя", 28, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артём", 27, "Москва", "директор по развитию бизнеса");

        System.out.println(maksim.toString());
        System.out.println(anna.toString());
        System.out.println(katya.toString());
        System.out.println(artem.toString());


    }
}