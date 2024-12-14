package de.qcademy.MapsHashMaps;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        HashMap<String, Integer> empId = new HashMap<>();
        empId.put("Bilel", 9875);
        empId.put("Ahmed", 6955);
        empId.put("Mohammad", 2456);

        System.out.println(empId);
        System.out.println(empId.get("Bilel"));
        System.out.println(empId.containsKey("Ahmed"));
        System.out.println(empId.putIfAbsent("Bilel", 222));
    }
}
