/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3.palindrome;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Bai3Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        
        boolean palindrome = true;

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                palindrome = false;
                break;
            }

            i++;
            j--;
        }

        if (palindrome) {
            System.out.println("Day la chuoi Palindrome");
        } else {
            System.out.println("Day khong phai la chuoi Palindrome");
        }
    }
}
