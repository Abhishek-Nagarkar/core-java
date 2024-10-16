package referencesandobjects;

public class Example1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Dog();

        animal.move();
        animal2.move();
    }
    
}

class Animal {
    public void move(){
        System.out.println("Animal is moving");
    }
}

class Dog extends Animal {
    @Override
    public void move(){
        System.out.println("Dog is moving");
    }
}