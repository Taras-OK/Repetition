package com.company.prog.m1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Дано текст. Убрать лишние пробелы, расставить знаки
препинания. Пример: «Я     длинное предложение Я
второе     предложение.» -> «Я длинное предложение. Я
второе предложение.»*/

public class Task30M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String s = scanner.nextLine();
        String[] text = s.split("[ ,.;]");
        StringBuilder sb = new StringBuilder();
        sb.append(text[0]);
        for (int i = 1; i < text.length; i++) {
            if (!text[i].equals("")&&Character.isUpperCase(text[i].charAt(0))) {
                sb.append(". ").append(text[i]);
            } else if (!text[i].equals("")) {
                sb.append(" ").append(text[i]);
            }
        }
        sb.append(".");
        System.out.println(sb.toString());
        //System.out.println(Arrays.toString(text));
        //System.out.println(s);
    }
}
