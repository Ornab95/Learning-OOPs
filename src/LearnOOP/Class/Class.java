//package Class;//

public class Class {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        Human human1 = new Human();
        Human human2 = new Human();

        Calculator calculator = new Calculator();

        dog1.name = "Morsalin";
        dog1.age = 25;
        dog1.color = "Broun";
        dog1.DogInfo();
        dog1.barking();

        System.out.println();

        dog2.name = "Nazmul";
        dog2.age = 24;
        dog2.color = "Dark-Broun";
        dog2.DogInfo();
        dog2.barking();
        System.out.println();

        cat1.name = "Santo";
        cat1.age = 25;
        cat1.color = "White";
        cat1.meowing();
        cat1.hungry();
        cat1.CatInfo();
        System.out.println();

        cat2.name = "Rakib";
        cat2.age = 26;
        cat2.color = "Broun";
        cat2.CatInfo();
        cat2.meowing();
        cat2.hungry();
        System.out.println();

        human1.name = "Ornab Biswass";
        human1.age = 23;
        human1.color = "Dark-Broun";
        human1.HumanInfo();
        human1.talking();
        human1.hungry();
        human1.sleeping();
        System.out.println();

        // human2.name = "Unknown(Because all Human are Vanish and Ornab only
        // Alive\nSo,
        // I'm Alone)";
        human2.name = "Unknown";
        human2.age = 00;
        human2.color = "Don't Know";
        human2.HumanInfo();
        human2.talking();
        human2.hungry();
        human2.sleeping();
        System.out.println();

        calculator.setNum1(10);
        calculator.setNum2(5);
        calculator.add();
        calculator.subNum1ToNum2();
        calculator.subNum2ToNum1();
        calculator.mul();
        calculator.divNum1ToNum2();
        calculator.divNum2ToNum1();
        System.out.println();
    }

}

class Dog {
    String name;
    int age;
    String color;

    void DogInfo() {
        System.out.println("Dog Name is: " + name + "\nAge: " + age + "\nColor: " + color);
    }

    void barking() {
        System.out.println(name + " is Barking loudly");
    }
}

class Cat {
    String name;
    int age;
    String color;

    void CatInfo() {
        System.out.println("Cat Name is: " + name + "\nAge: " + age + "\nColor: " + color);
    }

    void meowing() {
        System.out.println(name + " is Meowing");
    }

    void hungry() {
        System.out.println(name + " is Hungry Give Him Food (Nidrar Dudh)");
    }
}

class Human {
    String name;
    int age;
    String color;

    void talking() {
        System.out.println(name + " is Talking");
    }

    void hungry() {
        System.out.println(name + " is Hungry");
    }

    void sleeping() {
        System.out.println(name + " is Sleeping");
    }

    void HumanInfo() {
        System.out.println("Human Name is: " + name + "\nAge: " + age + "\nColor: " + color);
    }
}

class Calculator {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    void add() {
        System.out.println("Sum: " + (num1 + num2));
    }

    void subNum1ToNum2() {
        System.out.println("Sub: " + (num1 - num2));
    }

    void subNum2ToNum1() {
        System.out.println("Sub: " + (num2 - num1));
    }

    void mul() {
        System.out.println("Mul: " + (num1 * num2));
    }

    void divNum1ToNum2() {
        if (num2 != 0) {
            System.out.println("Div: " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    void divNum2ToNum1() {
        if (num1 != 0) {
            System.out.println("Div: " + (num2 / num1));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}
