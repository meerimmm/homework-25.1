package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Car,CarData>hashMap=new HashMap<>();
        hashMap.put(new Car(1,"777"),
                new CarData("2020","black","bmw i8","100000000"));
        for(Map.Entry<Car,CarData> a: hashMap.entrySet()){
            System.out.println("ключ:"+a.getKey()+"\nзначение: "+a.getValue());
        }
    }
}
