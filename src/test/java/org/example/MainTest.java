package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.math.BigInteger;
import java.time.Instant;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class MainTest {
    public ArrayList<Integer> read(String Path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(Path));
        String[] inputArray = reader.readLine().split(" ");
        List<Integer> result = new ArrayList<>();
        for (String s : inputArray) {
            result.add(Integer.parseInt(s));
        }
        return (ArrayList<Integer>) result;
    }
    @Test
    void _sum() throws IOException {
        Main main = new Main();
        ArrayList<Integer> testoviList = read("C:\\TestsJava\\testsum.txt");
        assertEquals(11175, Main._sum(testoviList));
    }
    @Test
    void _mult() throws IOException {
        Main main = new Main();
        ArrayList<Integer> testoviList = read("C:\\TestsJava\\testmult.txt");
        assertEquals(BigInteger.valueOf(479001600), Main._mult(testoviList));
    }
    @Test
    void _max() throws IOException {
        Main main = new Main();
        ArrayList<Integer> testoviList = read("C:\\TestsJava\\testmax.txt");
        assertEquals(298, Main._max(testoviList));
    }
    @Test
    void _min() throws IOException {
        Main main = new Main();
        ArrayList<Integer> testoviList = read("C:\\TestsJava\\testmin.txt");
        assertEquals(-97, Main._min(testoviList));
    }
    @Test
    void TestOfQuicksort() throws IOException {
        Main main = new Main();
        ArrayList<Integer> testoviList = read("C:\\TestsJava\\testquicksort.txt");
        ArrayList<Integer> norm = new ArrayList<Integer>();
        norm.add(-6); norm.add(-5); norm.add(-4); norm.add(-3); norm.add(-2); norm.add(-1); norm.add(0); norm.add(1); norm.add(1); norm.add(2); norm.add(2);
        norm.add(3); norm.add(3); norm.add(4); norm.add(4); norm.add(5); norm.add(6); norm.add(7); norm.add(8); norm.add(9); norm.add(10); norm.add(11);
        assertEquals(norm, Main.quicksort(testoviList));
    }
    @Test
    void Test100() throws IOException {
        Instant start = Instant.now();
        Main main = new Main();
        ArrayList<Integer> testoviList = read("C:\\TestsJava\\test100.txt");
        Main._sum(testoviList);
        Main._max(testoviList);
        Main._min(testoviList);
        Main._mult(testoviList);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("Время выполнения(100 чисел):" + timeElapsed);
    }
    @Test
    void Test1000() throws IOException {
        Instant start = Instant.now();
        Main main = new Main();
        ArrayList<Integer> testoviList = read("C:\\TestsJava\\test1000.txt");
        Main._sum(testoviList);
        Main._max(testoviList);
        Main._min(testoviList);
        Main._mult(testoviList);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("Время выполнения(1_000 чисел):" + timeElapsed);
    }
    @Test
    void Test100000() throws IOException {
        Instant start = Instant.now();
        Main main = new Main();
        ArrayList<Integer> testoviList = read("C:\\TestsJava\\test100000.txt");
        Main._sum(testoviList);
        Main._max(testoviList);
        Main._min(testoviList);
        Main._mult(testoviList);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("Время выполнения(100_000 чисел):" + timeElapsed);
    }
    @Test
    void Test1000000() throws IOException {
        Instant start = Instant.now();
        Main main = new Main();
        ArrayList<Integer> testoviList = read("C:\\TestsJava\\test1000000.txt");
        Main._sum(testoviList);
        Main._max(testoviList);
        Main._min(testoviList);
        Main._mult(testoviList);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("Время выполнения(1_000_000 чисел):" + timeElapsed);
    }
}