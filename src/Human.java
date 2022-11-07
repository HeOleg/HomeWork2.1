import java.time.LocalDate;

public class Human {

    String name;
    int age;
    String cityOfResidence;
    String position;

    public Human(String name, int age, String cityOfResidence, String position) {
        this.name = name;
        this.age = age;
        this.cityOfResidence = cityOfResidence;
        this.position = position;
    }

    public int getDateOfBirth() {
        if (age >= 0) {
            return LocalDate.now().getYear() - age;
        } else {
            return 0;
        }
    }

    public String getName() {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            return name;
        } else {
            return "<Информация не указана>";
        }
    }

    public String getCityOfResidence() {
        if (cityOfResidence != null && !cityOfResidence.isEmpty() && !cityOfResidence.isBlank()) {
            return name;
        } else {
            return "<Информация не указана>";
        }
    }

    public String getPosition() {
        if (position != null && !position.isEmpty() && !position.isBlank()) {
            return name;
        } else {
            return "<Информация не указана>";
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName()  +
               ". Я из города " + getCityOfResidence() +
               ". Я родился в " + getDateOfBirth()+
                " году." + "Я работаю на должности " + getPosition() + ". Будем знакомы.";
    }
}