package com.devmountain.noteApp.controllers;

import com.devmountain.noteApp.NoteAppApplication;
import org.springframework.boot.SpringApplication;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Exam2023 {



    /* The recursive Java method */
    public static void callMyself(long i) {
        if (i < 0) {
            return;
        }
        System.out.print(i);
        i = i - 1;
        callMyself(i);
    }
    public static void main(String[] args) {
       // System.out.println(" Hola como va ");
       // reverseString();
        //System.out.println(findDuplicates("ruuscanno"));
      //  compareTest();

       // callMyself(9);

        checkDBDriver();
    }

    public static void checkDBDriver(){
        try {
            Class.forName("org.postgresql.Driver");
            System.out.print("SUCCESS ! *********************** Driver is  here");
        } catch(ClassNotFoundException e) {
            System.out.print("Driver is not here");
        }
    }

    public static void reverseString() {
        String name = " Raul ";
        StringBuffer sb = new StringBuffer();

        for (int i = name.length() - 1; i > 0; i--) {
            char c = name.charAt(i);
            sb.append(c);
        }

        System.out.println(sb);
    }

    public static void checkAnagram() {
        String name = " Raul ";
        String elAnangram = "unAnagram";
        String elAnangram1 = "luar";

        for (int i = 0; i < name.length(); i++) {

        }
    }

    public static  List<Character> findDuplicates(String s) {
        Stack stack = new Stack();

        List<Character> arrayResult = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            for(int k=i+1;k<s.length();k++){
                if(c == s.charAt(k)){
                    arrayResult.add(c);
                    break;
                }
            }
        }

        return arrayResult;
    }

    public static void myLinkedList(){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);

    }

    public static void compareTest(){
        String uno = "uno";
        String dos = "uno";
        String tres = new String( "uno");
        System.out.println(uno.equals(tres));
    }

}
