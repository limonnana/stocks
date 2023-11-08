package com.devmountain.noteApp.controllers;

import java.util.List;

public class BinaryTreeOrdered {

    Tree tree;

    public static void main(String[] args) {


    }

    public void createTree(int i){



    }


}


class Tree{

    Tree(Tree head){
        this.head = head;
    }
    Tree(int value){
        this.value = value;
    }
    Tree head;
    int value;
    Tree leftLeg;
    Tree rightLeg;

   /* public void addLeg(Tree tree) {
        if (this.head == null) {
            this.head = tree;
        } else {
            if (this.head.getLeftLeg() == null) {
                this.head.setLeftLeg(tree);
            }else{
                if(this.head.getRightLeg() == null){
                    this.head.setRightLeg(tree);
                }
            }
        }

    }
    */
    public void addLeg(Tree tree){
        if (this.head == null) {
            this.head = tree;
        }
        if(this.getLeftLeg() == null){
            this.setLeftLeg(tree);
        }
    }


    public Tree getHead() {
        return head;
    }

    public void setHead(Tree head) {
        this.head = head;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Tree getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Tree leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Tree getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Tree rightLeg) {
        this.rightLeg = rightLeg;
    }

}


