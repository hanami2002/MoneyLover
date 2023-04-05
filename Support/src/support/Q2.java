/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package support;

import java.util.Scanner;

/**
 *
 * @author Hanami
 */
//Cài đặt chương trình tìm số thứ N trong dãy Fibonacci.
public class Q2 {

    public static int fibo(int n) {

        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("input N: ");
        int n= sc.nextInt();
        System.out.println("result: "+fibo(n));
    }
}
