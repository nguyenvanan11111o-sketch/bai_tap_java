/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1.tong_so_chan_trong_mang;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai1Tong_So_chan_trong_mang {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[5];
        int tong = 0;
        
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 5; i ++)
        {
            if(a[i] % 2 == 0)
            {
                tong += a[i];
            }
        }
        
        System.out.println("Tong cac so chan = " + tong);
    }
}