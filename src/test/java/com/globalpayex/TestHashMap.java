package com.globalpayex;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class TestHashMap {
    @Test
    void testMap1() {
        HashMap<Integer,String> map = new HashMap<>();
        assertEquals(0,map.size());

        map.put(10,"anirudha");
        map.put(5,"jane");
        assertEquals(2,map.size());

        assertEquals("anirudha",map.get(10));
        assertEquals("jane",map.get(5));

        map.put(5,"jill");
        assertEquals("jill",map.get(5));

        map.remove(5);
        assertEquals(1,map.size());

        var values = map.values();
        System.out.println(values);

        var keys = map.keySet();
        System.out.println(keys);
    }
}
