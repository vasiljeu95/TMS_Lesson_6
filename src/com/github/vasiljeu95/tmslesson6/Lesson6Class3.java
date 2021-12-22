package com.github.vasiljeu95.tmslesson6;

import java.util.Objects;

public class Lesson6Class3 {
    public static void main(String[] args) {
        newnewA a = new newnewA(1, "text");
        System.out.println(a);

        newnewA b = new newnewA(1, "text");
        System.out.println(a.equals(b));

        int[] arr = {1, 2, 3};
        int counter = 3;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = counter;
            counter++;
        }
    }
}

class newnewA {
    int a;
    String str;

    public newnewA(int a, String str) {
        this.a = a;
        this.str = str;
    }

    @Override
    public String toString() {
        return "a = " + a + ", str = " + str + ";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        newnewA newnewA = (newnewA) o;
        return a == newnewA.a && Objects.equals(str, newnewA.str);
    }
}