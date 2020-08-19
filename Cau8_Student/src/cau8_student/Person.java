/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau8_student;

import java.util.Scanner;

/**
 *
 * @author TK
 */
public class Person {
    String name;
    String gt;

    public Person() { //Khởi tạo hàm tạo không tham số (Contructor)
    }

    public Person(String name, String gt) { //Khởi tạp hàm tạo có tham số (contructor)
        this.name = name;
        this.gt = gt;
    }
    
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        while(true){
            String inputName = input.nextLine();
            boolean check = setName(inputName);
            if(check){
                break;
            }
        }
        System.out.print("Nhap gioi tinh: ");
        while(true){
            String inputGt = input.nextLine();
            boolean check = setGt(inputGt);
            if(check){
                break;
            }
        }
        
    }

    public String getName() {
        return name;
    }

    public String getGt() {
        return gt;
    }

    
    public boolean setName(String name){
        if(name.length()>0){
            this.name = name;
            return true;
        }else{
            System.out.println("Ten khong duoc bo trong");
            return false;
        }
    }
    public boolean setGt(String gt){
        if(gt.length()>0){
            this.gt = gt;
            return true;
        }else{
            System.out.println("Gioi tinh khong duoc trong");
            return false;
        }
    }
    
}
