package com.company;
public class Main {
    public static void main(String[] args) {
        float i, j, a = 2, b = 2, c = 1;
        int n = 3, m = 3;
        i = a;
        j = b;
        float s = 0;
        if (i == c || j == 0) {
            System.out.println("Ділити на нуль не можна");
        } else if (b > m || a > n) {
            System.out.println("Недопустимі значення");
        } else {
            for (i = a; i <= n; i++) {
                for (j = b; j <= m; j++) {
                    s +=  (i / j) / (i - c);
                }
            }
            System.out.println("Результат: " + s);
        }
    }
}