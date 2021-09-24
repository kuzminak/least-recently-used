import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest {

    @Test
    public void test1(){


        LRUCache lRUCache = new LRUCache(2);

        lRUCache.put(1, 1);
        assertEquals(1, lRUCache.get(1));

        lRUCache.put(2, 2);
        assertEquals(2, lRUCache.get(2));

        assertEquals(1, lRUCache.get(1));

        lRUCache.put(3, 3);
        assertEquals(3, lRUCache.get(3));
        assertEquals(-1, lRUCache.get(2));


        lRUCache.put(4, 4);
        assertEquals(4, lRUCache.get(4));
        assertEquals(3, lRUCache.get(3));


//        lRUCache.put(1, 1); // cache is {1=1}
//        lRUCache.put(2, 2); // cache is {1=1, 2=2}
//        lRUCache.get(1);    // return 1
//        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
//        lRUCache.get(2);    // returns -1 (not found)
//        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
//        lRUCache.get(1);    // return -1 (not found)
//        lRUCache.get(3);    // return 3
//        lRUCache.get(4);    // return 4

    }

//            ["LRUCache","put","put","put","put","get","get","get","get",
//            "put","get","get","get","get","get"]
//                    [[3],
//                    [1,1],
//                    [2,2],
//                    [3,3],
//                    [4,4],
//
//
//                    [4],[3],[2],[1],[5,5],[1],[2],[3],[4],[5]]
//    Output:
//            [null,null,null,null,null,4,3,2,-1,null,-1,2,-1,4,5]
//    Expected:
//            [null,null,null,null,null,4,3,2,-1,null,-1,2,3,-1,5]


    @Test
    public void test3(){

        LRUCache lRUCache = new LRUCache(3);

        lRUCache.put(1, 1);
        lRUCache.put(2, 2);
        lRUCache.put(3, 3);
        lRUCache.put(4, 4);

        assertEquals(4, lRUCache.get(4));
        assertEquals(3, lRUCache.get(3));
        assertEquals(2, lRUCache.get(2));
        assertEquals(-1, lRUCache.get(1));

        lRUCache.put(5, 5);

        assertEquals(-1, lRUCache.get(1));
        assertEquals(2, lRUCache.get(2));
        assertEquals(3, lRUCache.get(3));
        assertEquals(-1, lRUCache.get(4));
        assertEquals(5, lRUCache.get(5));
    }


    @Test
    public void test7(){

        LRUCache lRUCache = new LRUCache(8);

        lRUCache.put(10, 1);
        lRUCache.put(2, 22);
        lRUCache.put(30, 3);
        lRUCache.put(40, 4);
        lRUCache.put(50, 5);
        lRUCache.put(60, 6);
        lRUCache.put(70, 7);
        lRUCache.put(80, 8);

        System.out.println("tsest");

        assertEquals(4, lRUCache.get(4));
        assertEquals(3, lRUCache.get(3));
        assertEquals(2, lRUCache.get(2));
        assertEquals(1, lRUCache.get(1));

        lRUCache.put(9, 9);

        assertEquals(-1, lRUCache.get(5));
//        assertEquals(2, lRUCache.get(2));
//        assertEquals(3, lRUCache.get(3));
//        assertEquals(-1, lRUCache.get(4));
//        assertEquals(5, lRUCache.get(5));
    }

    @Test
    public void test4(){
        LRUCache lRUCache = new LRUCache(8);

        lRUCache.put(10,13);
        lRUCache.put(3,17);
        lRUCache.put(6,11);
        lRUCache.put(10,5);
        lRUCache.put(9,10);
        lRUCache.get(13);
        lRUCache.put(2,19);
        lRUCache.get(2);
        lRUCache.get(3);
        lRUCache.put(5,25);
        lRUCache.get(8);
        lRUCache.put(9,22);
        lRUCache.put(5,5);
        lRUCache.put(1,30);
        lRUCache.get(11);
        lRUCache.put(9,12);
        lRUCache.get(7);
        lRUCache.get(5);
        lRUCache.get(8);
        lRUCache.get(9);
        lRUCache.put(9,12);
        lRUCache.put(4,30);
        lRUCache.put(9,3);
        lRUCache.get(9);
        lRUCache.get(10);
        lRUCache.get(10);
        lRUCache.put(6,14);
        lRUCache.put(3,1);
        lRUCache.get(3);
        lRUCache.put(10,11);
        lRUCache.get(8);
        lRUCache.put(2,14);
        lRUCache.get(1);
        lRUCache.get(5);
        lRUCache.get(4);
        lRUCache.put(11,4);
        lRUCache.put(12,24);
        lRUCache.put(5,18);
        lRUCache.get(13);
        lRUCache.put(7,23);
        lRUCache.get(8);
        lRUCache.get(12);
    }

}
