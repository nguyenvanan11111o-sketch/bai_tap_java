/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2.chuan_hoa_ho_ten;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai2Chuan_hoa_ho_ten {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        
        ten = ten.trim();
        
        String[] tu = ten.split("\\s+");
        
        String ketqua = "";
        
        for (String tu1 : tu) {
            String word = tu1.toLowerCase();
            word = word.substring(0,1).toUpperCase()
                    + word.substring(1);
            ketqua += word + " ";
        }
        ketqua = ketqua.trim();
        
        System.out.println("Ho ten sau khi chuan hoa: " + ketqua);
    }
}