package com.demo;

import java.util.HashMap;
import java.util.Map;

public class MapExampe {

    public static void main(String[] args) {

        Map<Integer,String > map = new HashMap<Integer,String>();

        map.put(456,"Aravinth");
        map.put(123,"kavi");
        map.put(789,"Goks");

        for(Map.Entry e:map.entrySet()){

            System.out.println( e.getValue());
            System.out.println(  e.getKey());

        }


    }
}
