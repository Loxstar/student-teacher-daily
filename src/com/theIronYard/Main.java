package com.theIronYard;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Create  Student ArrayList variable
        ArrayList<Student> stuList = new ArrayList<>();

        //Add items to Student ArrayList
        stuList.add(new Student("Bill", "Thrill", 1, 1));
        stuList.add(new Student("Jim", "Bo", 2, 1));
        stuList.add(new Student("Hank", "Tank", 3, 1));
        stuList.add(new Student("Sam", "I Am", 4, 1));
        stuList.add(new Student("Ted", "Said", 5, 1));
        stuList.add(new Student("Earl", "Pearl", 6, 1));
        stuList.add(new Student("Kurt", "Pert", 7, 1));
        stuList.add(new Student("Mike", "Ike", 8, 1));
        stuList.add(new Student("Ben", "Ten", 9, 1));
        stuList.add(new Student("Luke", "Juke", 10, 1));
        stuList.add(new Student("Tim", "Jim", 11, 1));
        stuList.add(new Student("Ed", "Bread", 12, 1));
        stuList.add(new Student("Joe", "Schmo", 13, 1));
        stuList.add(new Student("Adam", "Schmadam", 14, 1));
        stuList.add(new Student("Chris", "Muss", 15, 1));

//        for (Student obj : stuList) {
//            System.out.println(obj);
//        }

        // Create Teacher ArrayList
        ArrayList<Teacher> teachList = new ArrayList<>();

        // Add items to Teacher ArrayList
        teachList.add(new Teacher("Sally", "Mae", 16, 1));
        teachList.add(new Teacher("Dave", "Mira", 17, 1));
        teachList.add(new Teacher("May", "June", 18, 1));

        // Setting up Hashmap
        Map<Teacher, Set<Student>> map = new HashMap<>();
        map.put(teachList.get(0), new HashSet<>());
        map.get(teachList.get(0)).add(stuList.get(0));
        map.get(teachList.get(0)).add(stuList.get(1));
        map.get(teachList.get(0)).add(stuList.get(2));
        map.get(teachList.get(0)).add(stuList.get(3));
        map.get(teachList.get(0)).add(stuList.get(4));

        map.put(teachList.get(1), new HashSet<>());
        map.get(teachList.get(1)).add(stuList.get(5));
        map.get(teachList.get(1)).add(stuList.get(6));
        map.get(teachList.get(1)).add(stuList.get(7));
        map.get(teachList.get(1)).add(stuList.get(8));
        map.get(teachList.get(1)).add(stuList.get(9));

        map.put(teachList.get(2), new HashSet<>());
        map.get(teachList.get(2)).add(stuList.get(10));
        map.get(teachList.get(2)).add(stuList.get(11));
        map.get(teachList.get(2)).add(stuList.get(12));
        map.get(teachList.get(2)).add(stuList.get(13));
        map.get(teachList.get(2)).add(stuList.get(14));

        for (Teacher t : map.keySet()) {
            System.out.println(t);
        }
        for (Set<Student> s : map.values()){
            System.out.println(s);
        }
    }
}
