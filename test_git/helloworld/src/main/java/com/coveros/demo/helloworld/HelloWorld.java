package com.coveros.demo.helloworld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

  public static void main(final String[] args) {

    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");
    final LocalDateTime now = LocalDateTime.now();

    System.out.println("Hello, World! The current time is " + dtf.format(now)+"c'est juste moi!");
    System.out.println("Hi, c'est amina");
  System.out.println("Hi, c'est janati");

  }

}
