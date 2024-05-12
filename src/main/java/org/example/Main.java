package org.example;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new Scanner(System.in).nextLine()));
            String[] inputArray = reader.readLine().split(" ");
            List<Integer> result = new ArrayList<>();
            for (String s : inputArray) {
                result.add(Integer.parseInt(s));
            }
            System.out.println("Минимальное значение: " + _min(result));
            System.out.println("Максимальное значение: " + _max(result));
            System.out.println("Сумма чисел в файле: " + _sum(result));
            System.out.println("Произведение чисел в файле: " + _mult(result));
        } catch (IOException e) {
            System.out.println("FileNotFound");
        }
    }

    public static List<Integer> quicksort(List<Integer> array) {
        if (array.size() <= 1) {
            return array;
        }
        int stable = array.get(array.size() / 2);
        List<Integer> left = new ArrayList<>();
        List<Integer> center = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i : array) {
            if (i < stable) {
                left.add(i);
            } else if (i == stable) {
                center.add(i);
            } else {
                right.add(i);
            }
        }
        left = quicksort(left);
        right = quicksort(right);
        left.addAll(center);
        left.addAll(right);
        return left;
    }

    public static long _sum(List<Integer> massiv) {
        long summa = 0;
        for (long i : massiv) {
            summa += i;
        }
        return summa;
    }

    public static BigInteger _mult(List<Integer> massiv) {
        BigInteger itog = BigInteger.ONE;
        BigInteger kef = BigInteger.ONE;
        int c = 1;
        for (int i : massiv) {
            if (i == 0) {
                return BigInteger.ZERO;
            } else {
                if (c == massiv.size() / 56) {
                    itog = itog.multiply(kef);
                    kef = BigInteger.ONE;
                    c = 1;
                }
                kef = kef.multiply(BigInteger.valueOf(i));
                c++;
            }
        }
        itog = itog.multiply(kef);
        return itog;
    }

    public static int _min(List<Integer> massiv) {
        return quicksort(massiv).get(0);
    }

    public static int _max(List<Integer> massiv) {
        return quicksort(massiv).get(massiv.size() - 1);
    }
}