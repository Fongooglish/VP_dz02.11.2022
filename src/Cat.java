enum Countries {
    RUSSIA, ENGLAND, SCOTLAND;
    // 1("Россия"), 2("Англия"), 3("Шотландия");

}

public class Cat {
    private String name;
    private int weight;
    private int age;
    private Countries country;
    private int number;


    public Countries getCountry() {
        Countries[] countries = Countries.values();
        return countries[number-1];
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Имя ='" + name + '\'' +
                ", Вес =" + weight +
                ", Возраст =" + age +
                ", Страна происхождения =" + getCountry();};
}

