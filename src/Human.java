public class Human {

    private int yearOfBirth;
    private String town;
    private String name;
    private String position;

    public Human(String name, int yearOfBirth, String town, String position) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.position = position;
    }

    public int getYearOfBirth() {
        if (yearOfBirth > 0) {
            return yearOfBirth;
        } else {
            return 0;
        }
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getName() {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            return name;
        } else {
            return "<Информация не указана>";
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name =  "<Информация не указана>";
        }
    }

    public String getTown() {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            return town;
        } else {
            return "<Информация не указана>";
        }
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "<Информация не указана>";
        }
    }

    public String getPosition() {
        if (position != null && !position.isEmpty() && !position.isBlank()) {
            return position;
        } else {
            return "<Информация не указана>";
        }
    }

    public void setPosition(String position) {
        if (position != null && !position.isEmpty() && !position.isBlank()) {
           this.position = position;
        } else {
            this.position = "<Информация не указана>";
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() +
                ". Я из города " + getTown() +
                ". Я родился в " + getYearOfBirth() +
                " году." + "Я работаю на должности " + getPosition() + ". Будем знакомы.";

    }
}