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
public class Student extends Person{
    String code;
    String classSt;
    

    public Student() {
    }
    
    @Override
    public void inputInfo(){
        super.inputInfo();
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap ma sinh vien: ");
        while(true){
            String inputCode = input.nextLine();
            boolean check = setCode(inputCode);
            if(check){
                break;
            }
        }
        
        System.out.print("Nhap lop: ");
        while(true){
            String inputClass = input.nextLine();
            boolean check = setClassSt(inputClass);
            if(check){
                break;
            }
        }
    }
    
    
    public String getCode() {
        return code;
    }
    public boolean setCode(String code){
        if(code!=null && code.length()==8){
            this.code = code;
            return true;
        }else{
            System.out.println("Dinh dang ma sinh vien sai, ma sinh vien co do dai 8 ky tu va khong duoc de trong \n Vui long nhap lai");
            return false;
        }
    }
    
    public boolean setClassSt(String classSt){
        if(classSt.length()>0){
            this.classSt = classSt;
            return true;
        }else{
            System.err.println("Lop khong duoc bo trong");
            return false;
        }
    }  
    
    public String getClassSt() {
        return classSt;
    }
    
    
    public void showInfo(){
        System.out.println("\nMa SV: " +code+ "\nTen: " + name+ "\nGioi tinh: " +gt+ "\nLop: " +classSt);
        System.out.println("");
    }

    public Student(String code, String classSt) {
        this.code = code;
        this.classSt = classSt;
        System.out.println("goi den ham khoi tao 2 tham so"+code+classSt);
    }
    
    
}
