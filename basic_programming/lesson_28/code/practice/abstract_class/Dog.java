package practice.abstract_class;

public class Dog extends Pet{

    private String name; // кличка

    private String breed; // порода

    public Dog(String kind, int age, double weight, boolean gender, String name, String breed) {
        super(kind, age, weight, gender);
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Мне нужна каша и мясо.");
    }

    @Override
    public void go() {
        System.out.println("Бегаю, обнюхиваю все, хожу в туалет");
    }

    @Override
    public void voice() {
        System.out.println("Гав - гав!");
    }
}
