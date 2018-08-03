package com.bobo.hard;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by evildoerDb on 2018/8/2 15:28
 */
public class DirectoryMemoryOOM {

    public static void main(String[] args) throws IllegalAccessException {
        Field field = Unsafe.class.getDeclaredFields()[0];
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);

        while (true){
            unsafe.allocateMemory(1024 * 1024 );
        }
    }
}
