package ru.job4j;

public class Preobraz {
    /*тип  размер в памяти       Диапазон значений

      byt     8 бит              от -128 до 127

      short   16 бит             от -32768 до 32767

       int    32 бита            от -2147483648 до 2147483647

       long   64 бита            от -9223372036854775808 до 9223372036854775807

      float   32 бита            от -3.4E+38 до 3.4E+38

      double  64 бита            от -1.7E+308 до 1.7E+308

      char    16 бит             от 0 до 65535

      boolean  1 бит             true или false
    */
    public static void main(String[] args) {
        // 1 выражение
        long l = 129;
        byte b = (byte) l;
        System.out.println(b);
// 2 выражение
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println(rsl);
// 3 выражение
        char c = 45000;
        float i1 = c;
        System.out.println(i1);
// 4 выражение
        double d = 121.19;
        byte b1 = (byte) d;
        System.out.println(b1);
// 5 выражение
        short s = 1500;
        char c1 = (char) s;
        double d1 = c1;
        System.out.println(d1);
    }
}
