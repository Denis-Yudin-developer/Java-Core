package main.java.Ylab.tasks.task1;

import java.util.Calendar;

public class Main {
    private final static int multiplier = 1103515245;
    private final static int increment = 12345;
    private final static int modulus = Integer.MAX_VALUE;
    private static int seed = (int) Calendar.getInstance().getTimeInMillis();

    private static int maxValue = Integer.MIN_VALUE;
    private static int minValue = Integer.MAX_VALUE;
    private static double average = 0.0;

    public static void main(String[] args) {
        int rowNumber = 10;
        int columnNumber = 10;
        int[][] numList = new int[rowNumber][columnNumber];
        long sum = 0L;
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                numList[i][j] = randomPositiveInt();
                if (numList[i][j] > maxValue){
                    maxValue = numList[i][j];
                }
                if (numList[i][j] < minValue){
                    minValue = numList[i][j];
                }
                sum += numList[i][j];
            }
        }
        average = (double) sum / (numList.length * numList[0].length);
        System.out.println("Max value in array: " + maxValue);
        System.out.println("Min value in array: " + minValue);
        System.out.println("Average value in array: " + average);
    }

    public static int randomPositiveInt(){
        seed = (seed * multiplier + increment) % modulus;
        if (seed < 0){
            seed = seed * -1;
        }
        return seed;
    }
}
