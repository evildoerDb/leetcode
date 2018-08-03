package com.bobo.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evildoerDb on 2018/8/1 15:56
 */
public class HeapOOM {

    public static void main(String[] args) {
        List<HeapOOM> heapOOMS = new ArrayList<>();
        while(true){
            heapOOMS.add(new HeapOOM());
        }
    }
}
