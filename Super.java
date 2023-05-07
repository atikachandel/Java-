//WAP using inheritance to show how to call the base class paratherized constructor using super.
class Animal {
    String name;
    
    public Animal(String name) {
      this.name = name;
    }
    
    public void makeSound() {
      System.out.println("The animal makes a sound.");
    }
  }
  
  class Dog extends Animal {
    public Dog(String name) {
      super(name);
    }
    
    @Override
    public void makeSound() {
      System.out.println("The dog barks.");
    }
  }
  
  public class Super {
    public static void main(String[] args) {
      Dog myDog = new Dog("Rex");
      System.out.println("My dog's name is " + myDog.name);
      myDog.makeSound();
    }
  }
  