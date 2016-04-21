package com.company.prog.m1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 04.04.2016.
 */

/*Написать код, который позволит менять и читать значения
        произвольных битов в массиве int-ов.*/

public class Task24M1 {
    static String toBinaryString(int x) {
        return String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
    }
    public static void main(String[] args) {
        int[] a = new int[]{0, 21212, 3211, 4122, 5245, 678, 77546, 84667, 97866, 1078697};
        //int nty = b00000000000000000000010001100000;
        //System.out.println(nty);
        //int nty1 =Integer.parseInt("000000000000000000010001100000");
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println(toBinaryString(a[i]));
        }
        String s;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; ; i++) {
            System.out.println("Введите символ операции: (R)-прочитать бит, (W)-записать бит, (E)-выйти");
            //s = scanner.nextLine();
            if ((s = scanner.nextLine()).equalsIgnoreCase("r")) {
                System.out.println("Введите, сначала, номер ячейки, в диапазоне от 1..." + a.length + ", а потом номер бита, в диапазоне 0...31");
                System.out.println(read(a, scanner.nextInt(), scanner.nextInt()));
            } else if (s.equalsIgnoreCase("w")) {
                System.out.println("Введите, сначала, номер ячейки, в диапазоне от 1..." + a.length + ", а потом номер бита, в диапазоне 0...31");
                int kl = scanner.nextInt();
                int byteN = scanner.nextInt();
                read(a, kl, byteN);
                System.out.println("Введите новое значение бита " + byteN + " в ячейке " + kl + ", (0 или 1)");
                int newByte = scanner.nextInt();
                if (newByte != 1 && newByte != 0) {
                    System.out.println("Неверно!!!");
                } else write(a, newByte, kl, byteN);
                System.out.println(Arrays.toString(a));
            } else if (!s.equalsIgnoreCase("w") && !s.equalsIgnoreCase("r")) {
                break;
            }
            s = "";
        }
    }

    private static void write(int[] a, int newByte, int kl, int byteN) {
        int r = 31;
        kl -= 1;
        r = r - byteN;
        String sb = toBinaryString(a[kl]);
        StringBuilder buil = new StringBuilder();
        buil.append(sb);
        System.out.println(buil.toString());
        buil.deleteCharAt(r);
        buil.insert(r, newByte);
        System.out.println(buil.toString());
        //int so = Integer.parseInt(buil.toString(),2);
        a[kl] = Integer.parseInt(buil.toString(),2);
        //System.out.println(so);
    }

    private static char read(int[] z, int a, int b) {
        int r = 31;
        a -= 1;
        r = r - b;
        String sb = toBinaryString(z[a]);
        char ch = '0';
        return sb.charAt(r);
    }

}
