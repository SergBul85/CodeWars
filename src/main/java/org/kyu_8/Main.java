package org.kyu_8;

public class Main {
    public static void main(String[] args) {
        var x = saleHotdogs(10);
        System.out.println(x);
    }

    public static int saleHotdogs(final int n) {
        return n < 5 ? 100*n : n >= 10 ? 90*n : 95*n;
    }

}
