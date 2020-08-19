/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau8_student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TK
 */
public class Cau8_Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> studentlList = new ArrayList<>();
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            showMenu();
            System.out.print("Nhap lua chon: ");
            choice = Integer.parseInt(sc.nextLine());
            
            switch(choice){
                case 1:{
                    int n;
                    System.out.println("Them bao nhieu sinh vien: ");
                    n = Integer.parseInt(sc.nextLine());
                    for(int i = 0; i<n; i++){
                        System.out.println("================================================================");
                        System.out.println("Nhap sinh vien thu "+ (i+1));
                        Student std = new Student();
                        std.inputInfo();
                        studentlList.add(std);
                    }
                    break;
                }
                case 2:{
                    for(int i=0; i<studentlList.size(); i++){
                        System.out.println("================================================================");
                        System.out.println("Thong tin sinh vien thu "+(i+1));
                        studentlList.get(i).showInfo();
                        System.out.println("================================================================");
                    }
                    break;
                }
                case 3:{
                    String searchName;
                    boolean a = false;
                    System.out.println("Nhap ten sinh vien can tim: ");
                    searchName = sc.nextLine();
                    for(int i=0; i<studentlList.size(); i++){
                        if(searchName.equals(studentlList.get(i).name)){
                            System.out.println("================================================================");
                            System.out.println("Thong tin sinh vien "+searchName+ " :");
                            studentlList.get(i).showInfo();
                            System.out.println("================================================================");
                            a = true;
                        }
                    }
                    if(a!=true){
                        System.out.println("================================================================");
                        System.err.println("Khong co sinh vien nao co ten "+ searchName);
                        System.out.println("================================================================");
                    }
                    break;
                }
            }
        }while(choice!=4);
    }
    
    static void showMenu(){
        System.out.println("1. Tao danh sach\n2. Hien thi danh sach\n3. Tim kiem theo ten\n4. Ket thuc");
    }
    
}
