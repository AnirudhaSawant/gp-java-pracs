package com.globalpayex;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class TestArrayList {

    @Test
    void testArrayList() {
        ArrayList<String> cars = new ArrayList<>();
        assertEquals(0,cars.size());

        cars.add("i10");
        cars.add("i20");

        assertEquals("i20",cars.get(1));

        cars.add(1,"mercedes");
        assertEquals("i20",cars.get(2));
        assertEquals("mercedes",cars.get(1));

        cars.set(0,"audi");
        assertEquals("audi",cars.get(0));

        cars.remove(0);
        assertEquals("mercedes",cars.get(0));

        assertFalse(cars.isEmpty());
        assertTrue(cars.contains("i20"));
    }

    @Test
    void testSortingAscending() {
        var nos = Arrays.asList(10,7,1,4,5);
        Collections.sort(nos);
        assertEquals(1,nos.get(0));
        assertEquals(10,nos.get(nos.size()-1));
        System.out.println(nos.getClass());
        System.out.println(nos);
    }

    @Test
    void testSortingDescending() {
       /* class DescComparator implements Comparator<Integer> {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }
        */
        var nos = Arrays.asList(10,7,1,4,5);
        //Collections.sort(nos,new DescComparator());
//        Collections.sort(nos, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });

        Collections.sort(nos,((o1, o2) -> o2.compareTo(o1)));

        assertEquals(10,nos.get(0));
        assertEquals(1,nos.get(nos.size()-1));
        System.out.println(nos.getClass());
        System.out.println(nos);
    }

    @Test
    void testEvenNoMoreThan2() {
        var nos = Arrays.asList(10,4,1,9,8,7);
//        ArrayList<Integer> temp = new ArrayList<>();
//        nos.forEach(element -> {
//            if(element % 2 == 0 && element > 2) {
//                temp.add(element);
//            }
//        });
//
//        var expected = Arrays.asList(10,4,8);
//        assertEquals(expected,temp);

        var expected = Arrays.asList(10,4,8);
        var nl = nos.stream().filter(element -> element % 2 == 0 && element > 2)
                .collect(Collectors.toList());

        assertEquals(expected,nl);

    }

}
