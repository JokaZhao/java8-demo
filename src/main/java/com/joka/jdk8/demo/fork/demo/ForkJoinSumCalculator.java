package com.joka.jdk8.demo.fork.demo;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

/**
 * Created on 2019/9/3 20:43.
 *
 * @author zhaozengjie
 * Description : 求和
 */
public class ForkJoinSumCalculator extends RecursiveTask<Long> {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        long[] longs = LongStream.rangeClosed(1, 10000).toArray();

        ForkJoinSumCalculator task = new ForkJoinSumCalculator(longs);

        Long invoke = new ForkJoinPool().invoke(task);

        long end = System.currentTimeMillis();

        System.out.println(invoke);

        System.out.println(end - start);

    }

    private final long[] num;

    private final int start;

    private final int end;

    public static final long THRESHOLD = 10;


    public ForkJoinSumCalculator(long[] num) {
        this(num, 0, num.length);
    }

    public ForkJoinSumCalculator(long[] num, int start, int end) {
        this.num = num;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int length = end - start;

        if (length < THRESHOLD) {
            return computeSequentially();
        }
        ForkJoinSumCalculator leftTask = new ForkJoinSumCalculator(num, start, start + length / 2);

        leftTask.fork();

        ForkJoinSumCalculator rightTask = new ForkJoinSumCalculator(num, start + length/2, end);

        Long rightResult = rightTask.compute();

        //会阻塞任务直到出结果
        Long leftResult = leftTask.join();

        return rightResult + leftResult;
    }

    private long computeSequentially() {
        long reduce = Arrays.stream(num).reduce(0, (a, b) -> a + b);
        return reduce;
    }
}
