package org.example;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        //FIRST ONE
        BinarySearch binarySearch = new BinarySearch();
        //            35
        //        25     45
        //                  55
        //                     65
        binarySearch.insert(35);
        binarySearch.insert(25);
        binarySearch.insert(45);
        binarySearch.insert(55);
        binarySearch.insert(65);

        //SECOND ONE
        BinarySearch secondBinarySearch = new BinarySearch();
        //            35
        //        25     45
        //                  55
        //                     65
        secondBinarySearch.insert(35);
        secondBinarySearch.insert(25);
        secondBinarySearch.insert(45);
        secondBinarySearch.insert(55);
        secondBinarySearch.insert(65);

        //TASK-1
        System.out.println("----------------");
        System.out.println("All leaves:");
        binarySearch.printAllLeaves();

        //TASK-2
        System.out.println("----------------");
        System.out.println("All right side nodes:");
        binarySearch.printRightNodes();

        //TASK-3
        System.out.println("----------------");
        boolean res = true;
        for (int i = 0; i < binarySearch.getNumbers().size(); i++) {
            if (!Objects.equals(binarySearch.getNumbers().get(i), secondBinarySearch.getNumbers().get(i))) res=false;
        }
        System.out.println("Result: "+res);
    }
}