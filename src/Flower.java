public class Flower {

    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;


    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan){
            this.name = name;
            this.flowerColor = flowerColor;
            this.country = country;
            this.cost = cost;
            this.lifeSpan = lifeSpan;
        }

    public String getName() {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            return name;
        } else {
            return "Название не задано";
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Название не задано";
        }
    }

    public String getFlowerColor() {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            return flowerColor;
        } else {
            return "Белый";
        }
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "Белый";
        }
    }

    public String getCountry() {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            return country;
        } else {
            return "Россия";
        }
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public double getCost() {
        if (cost >= 0) {
            return this.cost;
        } else {
            return 1;
        }
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }

    public int getLifeSpan() {
        if ( lifeSpan > 0) {
            return this.lifeSpan;
        } else {
            return 3;
        }
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    @Override
    public String toString() {
        return "Название: " + getName() + "." +
                " Цвет: " + getFlowerColor() + "." +
                " Страна: " + getCountry()  + "." +
                " Цена: " + getCost() + "руб." + "." +
                " Срок стояния: " + getLifeSpan() + "дней";
    }
}
