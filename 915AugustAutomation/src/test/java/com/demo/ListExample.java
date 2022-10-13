package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    int u=300;

    public static void main(String[] args) {


        int [] a ={23,56,78}; //size -3

        int [] b = new int[3]; //0,1,2
        b[0] = 1;
        b[1] = 3;
        b[2] =6;
        b[3] =9; // index out of bound exception

        //Declare an Array List
        // Add elements
        // find there size
        // read values
        //remove the values

        //List --> interface

        WebDriver driver = new ChromeDriver();

        List listi = new ArrayList<>();

       List <String> list = new ArrayList<String>();
       List <Integer> list2 = new ArrayList<Integer>();

        list.add("Aravinth");
        list.add("Kavi");
        list.add("goks");

        list.remove("kavi");

        list.add(1,"Apple");


        for(String output :list){
            System.out.println(output);
        }

    }
}
