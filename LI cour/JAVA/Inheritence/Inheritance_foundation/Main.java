package Inheritence.Inheritance_foundation;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stack<Character> charstack = new Stack<>();
        charstack.push('c');
        charstack.push('a');
        charstack.push('t');

        System.out.println(charstack.pop());
        System.out.println(charstack.pop());
        System.out.println(charstack.pop());

    }
}
