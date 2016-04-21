package com.company.prog.m1;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Написать аналог String.indexOf(). */

public class Task41M1 {
    public static void main(String[] args) {
        String s1 = "tascgdhfshfmnjgsdcg";
        System.out.println(s1.indexOf("sd"));
        System.out.println(s1.lastIndexOf("sd", 6));
        System.out.println("------------------------------");
        System.out.println(indexOf(s1,'s'));
        System.out.println(indexOf(s1,'s',3));
        System.out.println(indexOf(s1, "sd"));
        System.out.println(indexOf(s1, "sd",6));
        /*String s = "Now is the time for all good men " +

                "to come to the aid of their country " +

                "and pay their due taxes.";

        System.out.println(s);

        System.out.println("indexOf(t) = " + s.indexOf('f'));

        System.out.println("lastIndexOf(t) = " + s.lastIndexOf('f'));

        System.out.println("indexOf(the) = " + s.indexOf("the"));

        System.out.println("lastIndexOf(the) = " + s.lastIndexOf("the"));

        System.out.println("indexOf(t, 10) = " + s.indexOf('f', 10));

        System.out.println("lastIndexOf(t, 50) = " + s.lastIndexOf('f', 50));

        System.out.println("indexOf(the, 10) = " + s.indexOf("the", 10));

        System.out.println("lastIndexOf(the, 50) = " + s.lastIndexOf("the", 50));*/

    }

    private static int indexOf(String s, char ch) {
        int ret = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                ret = i;
                break;
            } else ret = -1;
        }
        return ret;
    }
    private static int indexOf(String s, char ch, int ind) {
        int ret = -1;
        for (int i = ind; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                ret = i;
                break;
            } else ret = -1;
        }
        return ret;
    }
    private static int indexOf(String s, String s1, int ind) {
        int ret = -1;
        int count = 0;
        int c = 0;
        for (int i = ind; i < s.length(); i++) {
            if (s.charAt(i) == s1.charAt(0)) {
                c = i;
                for (int j = 0; j < s1.length(); j++) {
                    if (s.charAt(c) == s1.charAt(j)) {
                        c++;
                        count++;
                    }
                }
                c = 0;
            }
            if (count == s1.length()) {
                ret = i;
                break;
            }else count = 0;
        }
        return ret;
    }
    private static int indexOf(String s, String s1) {
        int ret = -1;
        int count = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s1.charAt(0)) {
                c = i;
                for (int j = 0; j < s1.length(); j++) {
                    if (s.charAt(c) == s1.charAt(j)) {
                        c++;
                        count++;
                    }
                }
                c = 0;
            }
            if (count == s1.length()) {
                ret = i;
                break;
            }else count = 0;
        }
        return ret;
    }
}

