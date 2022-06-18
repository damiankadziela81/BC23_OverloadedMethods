package org.example;

public class Main {
    public static void main(String[] args) {

        // overloaded methods = methods that share the same name but have different parameters
        //						method name + parameters = method signature

        int x = add(1,2);
        System.out.println("x = "+x);
        int y = add(1,2,3);
        System.out.println("y = "+y);
        double a = add(1.0,2.0);
        System.out.println("a = "+a);
        double b = add(1.0,2.0,3.0);
        System.out.println("b = "+b);

    }
    static int add (int a, int b){
        System.out.println("This is overloaded method #1");
        return a + b;
    }
    static int add (int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }
    static double add (double a, double b) {
        System.out.println("This is overloaded method #3");
        return a + b;
    }
    static double add (double a, double b, double c) {
        System.out.println("This is overloaded method #4");
        return a + b + c;
    }

}