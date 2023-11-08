package com.devmountain.noteApp.controllers;

public class BinaryTree {

    Node head;

    public void makeBinaryTree(Node node){

        if(this.head == null){
            this.head = node;
        }

    }


}





class Node{

    int value;
    Node leftLeg;
    Node rightLeg;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Node leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Node getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Node rightLeg) {
        this.rightLeg = rightLeg;
    }


}
