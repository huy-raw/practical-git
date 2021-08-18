/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlab;

/**
 *
 * @author Admin
 */
public class StudentLab {
    private String id;
    private String name;
    private int age;
    private double math;
    private double english;
    private double informatic; //Điểm tin học
   
    
    
    //getter and setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getInformatic() {
        return informatic;
    }

    public void setInformatic(double informatic) {
        this.informatic = informatic;
    }
     
    
    public StudentLab() {
 
    }
    public StudentLab(String id, String name, int age, double math, double english, double informatic) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.math = math;
        this.english = english;
        this.informatic = informatic;
        
    }
      //Điểm trung bình
    public double avg(){
         return (this.math + this.english + this.informatic)/3;
    }
    
      //Hiển thị
    public void display(){
        System.out.format("Tên học sinh: "+this.name+" Tuổi: "+this.age+" ĐiểmTB: " + avg());
        
    }
      
    //Da xoa method
    
    
}
