package interfaces;

public interface Animal {
      void sleep();
      void eat();
      static void sound() { //in java8 we can use static keyword to create body of a method 
    	  System.out.println("bark");
      }
}
