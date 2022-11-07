public class Main {


    public static void main(String[] args) {

        Human maksim = new Human("Максим", 35, "Минск");
        Human anna = new Human("Анна", 29, "Москва");
        Human katya = new Human("Катя", 28, "Калининград");
        Human artem = new Human("Артём", 27, "Москва");

        System.out.println(maksim.toString());
        System.out.println(anna.toString());
        System.out.println(katya.toString());
        System.out.println(artem.toString());


    }
}