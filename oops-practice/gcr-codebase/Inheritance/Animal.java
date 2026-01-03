package Inheritance;

public class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
  class Dog extends Animal {
    Dog(String name,int age){
         super(name, age);
    }
    void makeSound() {
        System.out.println("Dog barks");
    }
}
  class Cat extends Animal {
    Cat(String name,int age){
         super(name, age);
    }
    void makeSound() {
        System.out.println("Cat meows");
    }
}
class Bird extends Animal {
    Bird(String name,int age){
         super(name, age);
    }
    void makeSound() {
        System.out.println("Bird chirps");
    }
}
class main{
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy", 3);
        Animal myCat = new Cat("Whiskers", 2);
        Animal myBird = new Bird("Tweety", 1);

        myDog.makeSound(); // Output: Dog barks
        myCat.makeSound(); // Output: Cat meows
        myBird.makeSound(); // Output: Bird chirps
    }
}
