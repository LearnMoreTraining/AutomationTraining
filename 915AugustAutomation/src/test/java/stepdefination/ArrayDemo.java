package stepdefination;

import java.util.ArrayList;

public class ArrayDemo

{

    public static void main(String[] args) {

        int [] firstSet = {4,8,9,10};

        System.out.println(firstSet[1]);

        int arraySize = firstSet.length;

        for(int output:firstSet){
            System.out.println(output);
        }

        ArrayList<String> list = new ArrayList<String>();
        list.add("Aravinth");
        list.add("Gokilam");
        list.add("JeyaBharathi");
        list.add("Kavi");

        System.out.println(list);

        for(String name:list){
            System.out.println(name);
        }

        ArrayList<Integer> numberList = new ArrayList<Integer>();

        numberList.add(1);
        numberList.add(5);

        System.out.println(numberList);

        for (int output:numberList){

            System.out.println(output);
        }

        ArrayList num = new ArrayList();
        num.add(1);
        num.add("Aravinth");

        for(Object o:num){
            System.out.println(o);
        }


    }


}
