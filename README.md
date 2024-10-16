# ***Core Java Concepts***
# ***Topics***
1. [References & Objects](#topics)
2. [Interfaces](#interfaces)
   
---
># *References & Objects*

Consider this statement  
` Animal animal = new Animal()`

First let's see what is what:  
Here variable `animal` is a **reference** of **type : Animal**.

Next, **`new Animal()`** creates an ***Object*** which is an **instance of class Animal** in the memory.

Before moving further understand that, references are of certain type ***(like interfaces, classes, subclasses)***.  

Where as an Object is always an instance of certain class ***(understand in this way, objects can be created from things which can be instantiated)***. 

Now, why did I mention this? Let's understand this further.

Consider an example:

    class Animal {
        
        // function
        public void move(){
            System.out.println("Animal is moving);
        }
    }

The statement:
> **Animal animal = new Animal()**

Here reference `animal` is of **type : Animal**, which points to an **object of class Animal**.

> *Reference variables point to an Object of certain class. References can be thought of like pointers pointing to an object in memory.*  

> *Think of a reference like a map that shows you where to find a particular house. The map doesn't contain the actual house, but it tells you how to get there.*

Consider another example:

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

    public class Example1 {
        public static void main(String[] args) {
            Animal animal = new Animal();
            Animal animal2 = new Dog();

            animal.move();
            animal2.move();
        }
    }

> *Output:   
Animal is moving  
Dog is moving*

Here `animal` is a `reference` of `type Animal pointing to object of Animal class`.
Here `animal` is a `reference` of `type Animal pointing to object of Animal class`.

Whereas `animal2` is a `reference` of `type Animal pointing to object of Dog class` ***(Base reference pointing to Child object)***.
Whereas `animal2` is a `reference` of `type Animal pointing to object of Dog class` ***(Base reference pointing to Child object)***.

> ***References are stored in Stack memory.  
> Objects are stored in heap memory.***

---
<br></br>

># *Interfaces*

*`Interface`* is an abstract type which contains `Method collection` & `constant variables`  

Used to achieve ***`Abstraction, Polymorphism & Multiple Inheritance`***.  

In an interface, we are basically allowed to use:
1. Constant variables
1. Abstract methods
2. Static methods
3. Default methods

> *Interfaces can be empty too!*

> *Interface variables are `public, static & final` by default. We can't change their visibility*.  