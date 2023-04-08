package javainterviewquestions;

public class Swap {
    public static void main(String[] args) {

        // Example 1: Type code to swap two integers
        //            a =12 and b = 5 ==> a = 5 and b = 12

        int a = 12;
        int b = 5;
        System.out.println(a + " " + b);

        //1.way:By using a third variable
        int temp = 0;

        //1.Step:
        temp = a;
        //2.Step:
        a = b;
        //3.Step:
        b = temp;
        System.out.println(a + " " + b);


        // 2.Way: do not create 3rd variable
        int a1 = 12;
        int b1 = 5;
        System.out.println("Before swapping " + a1 + " " + b1);
        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;
        System.out.println("After swapping " + a1 + " " + b1);

    }
}
