package com.github.vasiljeu95.tmslesson6;

public class Lesson6Class {
    public static void main(String[] args) {
        A a = new A("test");
        System.out.println(a.str);

        A b = new A();
        System.out.println(b.str);

        A c = new A (3);
        System.out.println(c.num);
        System.out.println(c.str);

        A d = new A (40, "texttexttext");
        System.out.println(d.str + d.num);

        A newObject = new A ("texttexttext");
        int number = newObject.calcNumberOfSymbols();
        System.out.println(number);
    }
}

class A {
    String str;
    int num;

    public A(String str, int num) {
        this.str = str;
        this.num = num;
    }

    public A (Integer b, String a) {
        str = a;
        num = b;
    }

    public A (Integer b) {
        num = b;
    }

    public A (String a) {
        str = a;
    }

    public A () {
        str = "1";
    }

    public int calcNumberOfSymbols() {
        int number = str.length();
        return number;
    }
}
