package ru.samsung.itschool.mdev;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Hashtable - хэщ
        // Пары - ключ-значение
        // все методы synchronized - потокобезопасные
        // неупородочены
        // null - нельзя

        Hashtable phones = new Hashtable();
        phones.put("Ivan",345345345);
        phones.put("Petr",34345);
        phones.put("Alex",334534);
        phones.put("Olga",45345);

        Enumeration keys = phones.keys();
        while(keys.hasMoreElements()) {
            String user = (String)keys.nextElement();
            System.out.println(user+";"+phones.get(user));
        }

        // HashMap
        // по аналогии с Hashtable
        // null - можно
        // потокнебезопасна

        HashMap<String,String> map1 = new HashMap<>();
        map1.put("key1","value1");
        map1.put("key2","value2");
        map1.put("key3","value3");

        HashMap<String,String> map2 = new HashMap<>();
        map2.put("key4","value4");
        map2.put("key5","value5");
        map2.put("key6","value6");

        map1.putAll(map2);

        map1.remove("key5");
        String result = (map1.containsKey("key6")) ? "ok" : "not";

        Set<Map.Entry<String,String>> set = map1.entrySet();
        for(Map.Entry<String,String> s: set) {
            System.out.println(s.getKey() + "; "+s.getValue());
        }

        // TreeMap
        // Сортирует (по ключам) - Natural ordering
        TreeMap<Integer,String> days = new TreeMap<>();
        days.put(3,"Monday");
        days.put(5,"Tuesday");
        days.put(1,"Wednesday");

        System.out.println(days.keySet());
        System.out.println(days.values());

        System.out.println(days.firstKey());
        System.out.println(days.get(days.firstKey()));



    }
}
