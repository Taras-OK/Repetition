package com.company.prog.m1;

/**
 * Created by Palamarjuk on 05.04.2016.
 */
public class OTest {
    public static void main(String[] args) {
        int c = 1, d = -6, e = 0;
        switch (c) {
            case 5:
                c = 8;
                break;
            case 7:
                c = 9;
                break;
            default:
                c = 11;
        }
        if ((c + d == e) || (e + c == d) || ((e = 1) > 0)) {
            System.out.println("yo!");
        } else {
            System.out.println("no!");
        }
    }
}

    /*public static void main(String[] args) {
        double d = 0.5;
        d = Math.pow(d, 2);
        String res = d + d > 0.45 ? "yes" : "no";
        System.out.println(res.length()); // ???
    }*/

    /*public static void main(String[] args) {
        int[] a = {11, 77};
        int x = 7;
        int y = x + 5 > 1 ? (x + 7 != 14 ? x : 7) : 7;
        System.out.println(a[y % 2]); // ???
    }*/

/*    static int do1(int a) {
        int b = a;
        a = b;
        b = a;
        return b;
    }
static int do2(int a) {
        int b = a;
        b *= b;
        return do1(b);
        }
public static void main(String[] args) {
        System.out.println(do2(5)); // ???????????????
        }*/


/*    public static void main(String[] args) {
        byte[] b = {3, 3, 3, 3, 3, 3};
        for (int k = 1; k < b.length - 1; k++)
            b[k] = (byte)(b[k - 1] + b[k + 1]);
        System.out.println(Arrays.toString(b));
    }*/

    /*public static void main(String[] args) {
        String s = "  1234%d89%d0  ";
        s = String.format(s, 0, 1).replace('1', 'Z').trim().toLowerCase();
        System.out.println(s);
    }*/

   /* public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            if ((i & 1) > 0)
                System.out.print("+");
            else System.out.print("-");
        }*/


    /*public static void main(String[] args) {
        long n = 3;
        do {
            n = (n * n) % 135;
        } while (n < 27);
        System.out.println(n);
    }*/

    /*public static void main(String[] args) {
        int u = 13;
        u += 2; u %= 4;
        u >>= 1; u = ~u;
        System.out.println(u);
    }*/

  /*  public static void main(String[] args) {
        char[] a = "abcdefghijk".toCharArray();
        for (char c : a)
            System.out.print((c > 'e') ? c : 'a');
    }*/

    /*public static void main(String[] args) {
        String s = "one two three";
        String[] a = s.split(" ");
        System.out.println(a[1]); // ???
    }*/

    /*public static void main(String[] args) {
        int i = 1;
        String r = "";
        String s = "abcd!ert";
        while (s.charAt(i) != '!') r+=s.charAt(i++);
        System.out.println(r);
    }*/

   /* public static void main(String[] args) {
        int x = 01; int y = 02;
        System.out.println((x << 1) + (y >> 1));
    }*/

    /*public static void main(String[] args) {
        String s = "aaaa";
        String s1 = s.replace("a", "bb");
        System.out.println(s);
        System.out.println(s.replace("bbbb", "aaaa"));
        System.out.println(s1);
    }*/

  /*  public static void main(String[] args) {
        for (int i = 0, j = 1; i < 10; i++, j++)
            System.out.println(i + j);
    }*/

   /* public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);
        sb.append('A').append('b').append("777");
        sb.deleteCharAt(1);
        System.out.println(sb.toString() + 1); // ???
    }*/

   /* public static void main(String[] args) {
        int[] a = new int[] {1,1,1};
        a[a[a[0]++]] = 7;
        a[a[0]--] = 8;
        a[++a[0]] = 9;
        System.out.println(Arrays.toString(a)); // ???
    }*/

    /*public static void main(String[] args) {
        byte[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        byte[] b = new byte[a.length / 2];
        System.arraycopy(a, 5, b, 1, 2);
        System.out.println(Arrays.toString(b)); // На экране?
    }*/

 /*   public static void main(String[] args) {
        String s = "abcdefghijk";
        System.out.println(s.substring(4) + s.substring(0, 2)); // на экране - ?
        System.out.println(s.substring(10)); // на экране - ?
        System.out.println(s.substring(0)); // на экране - ?
    }
*/
  /*  public static void main(String[] args) {
        int y = 8; int z = 7;
        if ((y == z) || ((z - y == 1) && (z / y > 0)))
        System.out.println("YES");
        else
        System.out.println("NO"); // на экране - ?
    }*/

/*    public int xxxx(int x, int y) {
        int x = x + y;
        return x;
    }*/


   /* public static void aaabbb() {
        int x;
        for (x = 7; x < 66; ++x) ;
        System.out.println(x);
    }

    public static void main(String[] args) {
        aaabbb();
    }*/

/*
    public static void test(int[] x) {
        x[0] = x[1] = x[2] = 7;
        x[3]++;
    }
    public static void main(String[] args) {
        final int[] x = {1, 2, 3, 4, 5, 6};
        test(x);
        test(x);
        test(x);
        System.out.println(Arrays.toString(x));
// что будет выведено на экран?
    }
*/


   /* public static int calc(int x) {
        int xx = x;
        do {
            xx *= 55;
        } while (xx < 6);
        return x;
    }
    public static void main(String[] args) {
        int r = calc(3);
        System.out.println(r); // что будет выведено на экран?
    }*/

    /*public static void main(String[] a) {
        int n = 2;
        while (n++ < 10)
            n += 2;//4 7 10
        System.out.println(n); // какое будет значение n?
    }*/

   /* public static void main(String[] args) {
        int[] a = new int[50];
        Arrays.fill(a, 3);
        for (int j = 1; j < a.length; j++) {
            a[j] = a[j - 1] + 0x10;
        }
        System.out.println(Arrays.toString(a));
    }*/


    /*public static void A() {
        int[] a = new int[100];
        a[0] = 2;
        for (int j = 1; j < a.length; j++) {
            a[j] = a[j - 1] + 1;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        A();
    }*/

    /*public static final void doJob() {
        long x = 1;
        double y = 2;
        System.out.println("Result=" + (x + y));
    }

    public static void main(String[] args) {
        doJob();
    }*/

    /*public static final void doJob() {
        double x = 3;
        System.out.println("Result=" + "x");
        System.out.println("Result=" + x);
    }

    public static void main(String[] args) {
        doJob();
    }*/



    /*public static int getRes(int x, int y) {
        if ((x == 7) || (y > x))
            return x * y;
        else if (y - x > 3*3)
        return y - x;
        else
        return x / y;
    }
    public static void doJob() {
        final int r = getRes(7, 1);
        System.out.println("Result = " + r);
// Что будет выведено на экран?
    }

    public static void main(String[] args) {
        doJob();
    }*/


