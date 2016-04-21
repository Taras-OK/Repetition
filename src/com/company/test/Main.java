package com.company.test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}




        /*int[] a = new int[25];
        final int len = a.length;
        int n = (len % 2 == 0) ? 1 : 0;
        for (int i = len / 2; i < len; i++) {
            a[i] = a[a.length - i - 1] = n++;
           // a[i] = n; a[a.length - i - 1] = n++;
        }

        System.out.println(Arrays.toString(a));
    }

    }*/


        /*int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            final int len = a.length;
            int t;
            for (int i = 0; i < len / 2; i++) {
                t = a[i];
                a[i] = a[len - i - 1];
                a[len - i - 1] = t;
            }
        System.out.println(Arrays.toString(a));
        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count elements");
        int a = scanner.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter elements");
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the number of the element that you want to see, but not more than" + a);
        for (int i=0;i<arr.length-1;) {
            System.out.println(arr[scanner.nextInt()-1]);
        }*/


        /*int[] i = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Array " + Arrays.toString(i));
        int[] j = new int[i.length];
        int p = i.length - 1;
        for (int c=0; c<i.length; c++, p--) {
            j[c] = i[p];
        }
        System.out.println("Mirror array " + Arrays.toString(j));*/

       /* int[] z = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] b = new int[5];
        int[] c = new int[5];
        System.arraycopy(z, 0, b, 0, 5); //5 это ко-во элементов которые необходимо копировать (5 элементов начиная с 0-го)
        System.arraycopy(z, 5, c, 0, 5); //5 это ко-во элементов которые необходимо копировать (5 элементов начиная с 5-го)
        Arrays.sort(c);
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 elements throught 'ENTER'");
        int[] a = new int[10];
        a[0] = scanner.nextInt();
        a[1] = scanner.nextInt();
        a[2] = scanner.nextInt();
        a[3] = scanner.nextInt();
        a[4] = scanner.nextInt();
        a[5] = scanner.nextInt();
        a[6] = scanner.nextInt();
        a[7] = scanner.nextInt();
        a[8] = scanner.nextInt();
        a[9] = scanner.nextInt();
        int[] b = new int[5];
        int[] c = new int[5];
        c = Arrays.copyOfRange(a, 5, 10);
        Arrays.sort(c);
        System.arraycopy(a, 0, b, 0, 5);
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));*/

        /*int[] z = new int[]{22, 35, 69, 15, 45, 69, 7, 85, 3};
        System.out.println(Arrays.toString(z));
        int i = z[0];
        z[0] = z[z.length - 1];
        z[z.length - 1] = i;
        System.out.println(Arrays.toString(z));*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 elements throught 'ENTER'");
        int[] a = new int[10];
        a[0] = scanner.nextInt();
        a[1] = scanner.nextInt();
        a[2] = scanner.nextInt();
        a[3] = scanner.nextInt();
        a[4] = scanner.nextInt();
        a[5] = scanner.nextInt();
        a[6] = scanner.nextInt();
        a[7] = scanner.nextInt();
        a[8] = scanner.nextInt();
        a[9] = scanner.nextInt();
        System.out.println(a.length);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));*/

        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);*/

        /*System.out.println("Enter S1 ");
        String s1 = scanner.nextLine();
        System.out.println("Enter S2 ");
        String s2 = scanner.nextLine();
        System.out.println("Enter S3 ");
        String s3 = scanner.nextLine();
        System.out.println(s1 + s3);
        System.out.println(s3 + s2 + s1);
        System.out.println(s1 + s2 + s3);*/



