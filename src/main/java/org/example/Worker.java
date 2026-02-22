package org.example;


public class Worker implements Runnable {
    private final double[][] A;
    private final double[][] B;
    private final double[][] C;
    private final int iStart, jStart, iStop, jStop;
    private final int N;

    public Worker(double[][] A, double[][] B, double[][] C, int iStart, int jStart, int iStop, int jStop, int N) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.iStart = iStart;
        this.jStart = jStart;
        this.iStop = iStop;
        this.jStop = jStop;
        this.N = N;
    }

    @Override
    public void run() {
        for (int i = iStart; i < iStop; i++) {
            for (int j = jStart; j < jStop; j++) {
                double sum = 0.0;
                for (int k = 0; k < N; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
    }
}
