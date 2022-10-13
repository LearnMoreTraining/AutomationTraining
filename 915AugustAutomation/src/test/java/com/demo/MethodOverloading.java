package com.demo;

import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodOverloading extends ListExample{

      final int formula =456;
      int u=89;

    public static void main(String[] args) {

        MethodOverloading h = new MethodOverloading();
        h.m1(1);

        fillform("Aravinth",967756,27);
        fillform("Kavi",74737,3637273,45);
    }

    //int=5678, long , float 4.35446565776 , double 1.345

    public  static void fillform(String Name,long primary, int age ){

    }

    public static void fillform(String Name,long primary,long secondary,int age){

    }

    public void m1(int a){

     final   int u =100;

        System.out.println(super.u);
        System.out.println(this.u);
        System.out.println(a);




    }

    public static void m1(String a){
        System.out.println(a);
    }

    public static void m1(int a,int b){
        System.out.println(a+b);
    }

}
