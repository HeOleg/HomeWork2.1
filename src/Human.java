import java.time.LocalDate;

public class Human {

    String name;
    int age;
    String cityOfResidence;

    public Human(String name, int age, String cityOfResidence) {
        this.name = name;
        this.age = age;
        this.cityOfResidence = cityOfResidence;
    }

    public int getDateOfBirth() {
        int dateOfBirth = LocalDate.now().getYear() - age;
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name  +
               ". Я из города " + cityOfResidence +
               ". Я родился в " + getDateOfBirth()+ " году. Будем знакомы.";
    }
}