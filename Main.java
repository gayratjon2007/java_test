package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner (in);
        System.out.println("a: ");
        int a = scanner .nextInt();
        System.out.println("b: ");
        int b = scanner .nextInt();
        System.out.println("c: ");
        int c = scanner .nextInt();
        if (a>b&&a>c) {

            System.out.println("a "+a);
        }else if(b>a&&c<b){
            System.out.println("b " +b);
        }else {
            System.out.println("c "+c);
        }

    }
}
