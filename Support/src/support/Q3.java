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
//Cho dãy số A. Có bao nhiêu cặp n số không trùng nhau, liệt kê các cặp số đó. Ví dụ: A = 1,2,3.
//Khi n = 2 thì kết quả có 3 cặp số, danh sách: 1&2, 1&3, 2&3. 
//Khi n = 3 thì kết quả có 1 cặp số là 1,2,3.
public class Q3 {
 static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number of elements in array");
        int size = sc.nextInt();
        System.out.println("input element: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("a[" + i + "]= ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\n");
        System.out.print("Input N= ");
        int n = sc.nextInt();
        printDistinctNSubsets(arr, n);
        System.out.println("result: "+count);
    }

    public static void printDistinctNSubsets(int[] arr, int n) {
        int[] subset = new int[n];
        findDistinctNSubsets(arr, n, 0, subset, 0);
    }

    public static void findDistinctNSubsets(int[] arr, int n, int index, int[] subset, int i) {
        if (index == n) {
            // Check for duplicates
            boolean duplicate = false;
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (subset[j] == subset[k]) {
                        duplicate = true;
                        break;
                    }
                }
            }
            if (!duplicate) {
                // Print distinct subset
                for (int j = 0; j < n; j++) {
                    System.out.print(subset[j] + " ");
                    
                }
                count++;
                System.out.println();
            }
            return;
        }
        if (i >= arr.length) {
            return;
        }
        subset[index] = arr[i];
        
        findDistinctNSubsets(arr, n, index + 1, subset, i + 1);
        findDistinctNSubsets(arr, n, index, subset, i + 1);
    }

    public static int calculateCombination(int n, int k) {
        int numerator = 1;
        int denominator = 1;
        for (int i = 1; i <= n; i++) {
            numerator *= i;
        }
        for (int i = 1; i <= k; i++) {
            denominator *= i;
        }
        for (int i = 1; i <= n - k; i++) {
            denominator *= i;
        }

        return numerator / denominator;
    }
}
