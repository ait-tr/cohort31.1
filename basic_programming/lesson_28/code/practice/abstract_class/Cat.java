package practice.abstract_class;

public class Cat extends Pet {

    private String name;
    private String breed;
    private String color;

    public Cat(String kind, int age, double weight, boolean gender, String name, String breed, String color) {
        super(kind, age, weight, gender);
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Мне нужно питание для кошек!");
    }

    @Override
    public void go() {
        System.out.println("Я редко гуляю сама по себе.");
    }

    @Override
    public void voice() {
        System.out.println("Мяу, мяу");
    }
}
