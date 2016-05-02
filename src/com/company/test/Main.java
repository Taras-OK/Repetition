package com.company.test;

import java.io.File;

class Dir {
    public static void main(String args[]) {
        String[] list = new File("https://docs.oracle.com").list();
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);


            for(String s: args)
               System.out.println(s);

    }

}
