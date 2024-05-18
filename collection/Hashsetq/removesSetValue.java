package collection.Hashsetq;

import java.util.*;

public class removesSetValue {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        HashSet<Integer> nums1 = new HashSet<Integer>();
        nums1.add(2);
        nums1.add(3);
        nums1.add(4);
        nums1.add(5);
        HashSet<Integer> nums2 = new HashSet<Integer>();
        nums2.add(6);
        nums2.add(7);
        nums2.add(8);
        nums2.add(9);
        System.out.println("Before removing the set value/Element");

        System.out.println("HashSet Elements : " + nums);
        System.out.println("HashSet Elements : " + nums1);

        System.out.println("HashSet Elements : " + nums2);
        System.out.println("After removing the set value/Element");

        if (nums.removeAll(nums1)) {
            System.out.println("Elemtn deleted nums1");

        } else {
            System.out.println("Not found");
        }
        if (nums.removeAll(nums2)) {
            System.out.println("Elemtn deleted nums2");

        } else {
            System.out.println("Not found");
        }

        System.out.println(nums1);
        System.out.println(nums2);
        System.out.println(nums); //here only remain value is 1 because all value of this set is match

    }
}
