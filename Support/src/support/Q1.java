/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package support;

import java.util.Arrays;
import java.util.Scanner;
//Cho dãy số tự nhiên A. 
//Cài đặt chương trình sắp xếp dãy số A từ nhỏ đến lớn 
//và loại bỏ số không phải là số nguyên tố.

public class Q1 {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    public static void main(String[] args) {
        System.out.println("input number of parameter in array: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        int[] A = new int[n];
        System.out.println("input elements of array");
        for(int i=0;i<n;i++){
            System.out.print("A["+i+"]= ");
            A[i]=sc.nextInt();
        }
        Arrays.sort(A);

        int[] primes = removeNonPrimes(A);

        for (int i : primes) {
            System.out.print(i + " ");
        }
    }

    public static int[] removeNonPrimes(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (isPrime(i)) {
                count++;
            }
        }

        int[] primes = new int[count];
        int j = 0;
        for (int i : nums) {
            if (isPrime(i)) {
                primes[j++] = i;
            }
        }

        return primes;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
