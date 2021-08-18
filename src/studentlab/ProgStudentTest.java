/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlab;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProgStudentTest {

    /**
     * @param args the command line arguments
     */
    static Scanner nhap = new Scanner(System.in);
    static void nhapThongTin(StudentLab infor) {
        //Nhập ID
        System.out.println("Nhập ID :");
        infor.setId(nhap.nextLine());
        //Nhập tên
        System.out.println("Nhập tên :");
        infor.setName(nhap.nextLine());
        //Nhập tuổi
        System.out.println("Nhập tuổi :");
        infor.setAge(nhap.nextInt());
        //Nhập điểm toán, anh văn và tìn học
        System.out.println("Nhập điểm toán :");
        infor.setMath(nhap.nextDouble());
        
        System.out.println("Nhập điểm anh văn :");
        infor.setEnglish(nhap.nextDouble());
        
        System.out.println("Nhập điểm tin :");
        infor.setInformatic(nhap.nextDouble());
        
        
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
             StudentLab  ds_Student[] = null;
     
             //Nhập thông tin sinh viên
             System.out.println("Nhập số lương sinh viên cần khai báo: ");
                int n = nhap.nextInt();
                ds_Student = new StudentLab[n];
                for (int i = 0; i < n; i++) {
                    System.out.println("Sinh viên thứ " + (i + 1)+": ");
                    ds_Student[i] = new StudentLab();
                    nhapThongTin(ds_Student[i]);
                }
        
            //Xuất ra 
            System.out.println("Danh sách sinh viên : ");
                for (int i = 0; i < n; i++) {
                    ds_Student[i].display();
                    System.out.println("\n");
                }
       
        
        
        
    }
    
}
