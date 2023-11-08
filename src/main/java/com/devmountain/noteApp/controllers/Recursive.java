package com.devmountain.noteApp.controllers;

import org.springframework.boot.autoconfigure.mail.MailProperties;

import java.util.*;

public class Recursive {
    int counter1 = 1;
    List<Integer> l = new ArrayList<Integer>();
    int counter2;
     static int counter ;
    static int n1;

    public static void main(String[] args) {
        Recursive r = new Recursive();
        //fibonacci(0);
        //sumSeriesOfNumbers(2);
       // r.getFibonacci(0);
        r.factorial(4);
    }
    static void sumSeriesOfNumbers(int initial){

        if(initial>0){
            int sum = initial + (initial - 1);
            counter = counter + sum;
            sumSeriesOfNumbers(initial - 1);
        }
        System.out.println("Total: " + counter);
        return;
    }

    /*public static void fibonacci(int start){
        if(start > 20){
            return;
        }
        n1 = start + 1;
        counter = start + n1;
        System.out.print(start + " ");
        System.out.print(n1 + " ");
        System.out.print(counter + " ");
        fibonacci(counter);

    }      */
    public void getFibonacci(int number){
        counter1 = number + 1;
        System.out.print(number + " ");
        System.out.print(counter1 + " ");
      //  System.out.print(number+ " ");
      //  System.out.print(b + " ");
        fibonacci(number, counter1);
    }
    public  void fibonacci(int a , int b){
        if(counter1 > 20){
            return;
        }
         counter1 = a + b;
       // System.out.println("a: " + a);
       // System.out.println("b: " + b);
        System.out.print( counter1 + " ");

        fibonacci(b ,counter1);
    }

    public void reverseString(String s){
        int length = s.length();
        List l = new LinkedList<String>();
        StringBuffer sb = new StringBuffer();
        if(counter < 0){
            return;
        }
            //  char c = s.charAt()
    }

    public void factorial(int n){
        int counter = 0;
        l.add(n);
        int multiplicador = n-counter2;
        if(multiplicador == 1){
            for(int i=0; i<l.size();i++){
                counter = l.get(i);
            }
            System.out.print(" Total factorial: " + counter1);
            return;
        }

      //   counter1 =  counter1 * multiplicador;
         counter2++;
         factorial(multiplicador);
    }
}
