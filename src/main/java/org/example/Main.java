package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int N = 1650;
        int numThreads = 2;

        double[][] A = new double[N][N];
        double[][] B = new double[N][N];
        double[][] C = new double[N][N];

        Random random = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = random.nextDouble() * 10;
                B[i][j] = random.nextDouble() * 10;
            }
        }

        System.out.println("Iniciando multiplicação de matrizes com threads...");
        long startTime = System.nanoTime();

        Thread[] threads = new Thread[numThreads];
        int step = N / numThreads;

        for (int t = 0; t < numThreads; t++) {
            int iStart = t * step;
            int iStop = (t == numThreads - 1) ? N : iStart + step;

            Worker worker = new Worker(A, B, C, iStart, 0, iStop, N, N);
            threads[t] = new Thread(worker);
            threads[t].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        long endTime = System.nanoTime();
        System.out.println("Multiplicação concluída!");

        long durationMs = (endTime - startTime) / 1_000_000;
        System.out.println("Tempo total: " + durationMs + " ms");
    }
}


