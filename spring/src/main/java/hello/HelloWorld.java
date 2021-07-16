package main.java.hello;

import java.time.*;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = LocalTime.now();
    System.out.println("The current local time is: " + currentTime);
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}