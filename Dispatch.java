//Q3. WAP on dynamic method of dispatch.
class Dispatch {
    void speak() {
      System.out.println("Dispatch function called");
    }
  }
  
  class D1 extends Dispatch {
    void speak() {
      System.out.println("D1 called");
    }
  }
  
  class D2 extends Dispatch {
    void speak() {
      System.out.println("D2 called");
    }
  }
  
  class Main {
    public static void main(String[] args) {
      Dispatch dispatch = new Dispatch();
      D1 d1 = new D1();
      D2 d2 = new D2(); 
      Dispatch ref;
      ref = dispatch;
      ref.speak();
      ref = d1;
      ref.speak();
      ref = d2;
      ref.speak();
    }
  }
  
