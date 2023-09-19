package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();

        System.out.println("1234 + 4321 = " + calculator.plus(1234, 4321));
        System.out.println("911 - 170 = " + calculator.minus(911, 170));
        System.out.println("2 * 3 = " + calculator.mul(2, 3));
        System.out.println("33 / 11 = " + calculator.div(33, 11));

        System.out.println("\n");

        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal[] animals = { cat, dog };
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}

class CalculatorImpl implements Calculator {
    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        if (b == 0) {
            System.err.println("Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat says Meow!");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog says Woof!");
    }
}