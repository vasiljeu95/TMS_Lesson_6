package com.github.vasiljeu95.tmslesson6;

public class Lesson6Class2Super {
    public static void main(String[] args) {
        newA a = new B (10);
        a.print();
    }
}

class newA {
    int a;
    newA (int a) {
        this.a = a;
    }

    void print() {
        System.out.println(a);
    }
}

class B extends newA {
    int a = 2;

    B (int a) {
        super(a);
    }

    void print() {
        super.print();
        System.out.println(super.a);
        System.out.println(a);
    }
}