MARKDOWN TUTORIAL
For heading use Hashtag
# Heading 1
For paragraphs simply leave a line before and after text

This is a paragraph just like above line

To make text bold use two asterisk and for italic use one asterisk before and after the text

**bold text** and *italic text*

For blockquotes use greater than symbol

> Blockquotes example

For ordered List use numbers followed by dot
1. One
2. Two
4. Three 

> Above example shows that numbers can be random, just follow this pattern, a list will be created

For unordered list use hyphens

- one
- two
  -  three
  -  four

To create code blocks use 4 space or a tab

    import java.util
    class Main {
        public static void main(String[] args){
            System.out.println("hello world);
        }
    }

To denote a word as code use back ticks ``
Hello `world`

For horizontal rule use 3 or more hyphens or stars

---
***

For links use square brackets for caption or text and followed by circular brackets containing the url
[Google](www.google.com)



# ***Core Java Concepts***

> *References & Objects*

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

Here animal is a reference of type Animal pointing to object of Animal class.

Whereas animal2 is a reference of type Animal pointing to object of Dog class ***(Base reference pointing to Child object)***.

> ***References are stored in Stack memory.  
> Objects are stored in heap memory.***