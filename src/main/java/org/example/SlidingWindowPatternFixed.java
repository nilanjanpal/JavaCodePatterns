package org.example;

public class SlidingWindowPatternFixed {

    public static void main(String args[]){
        int[] testArray = {-1,2,0,3,-5,4,-2};
        int windowSize = 3;
        int sum = 0;
        int maxSum = 0;
        int leftPointerPosition = 0;
        int rightPointerPosition = windowSize - 1;
        int index = leftPointerPosition;
        while(index <= rightPointerPosition){
            maxSum = maxSum + testArray[index];
            index++;
        }
        sum = maxSum;
        rightPointerPosition = rightPointerPosition + 1;
        while(rightPointerPosition < testArray.length){
            sum = sum - testArray[leftPointerPosition];
            leftPointerPosition++;
            sum = sum + testArray[rightPointerPosition];
            rightPointerPosition++;
            maxSum = determineMax(maxSum, sum);
        }
        System.out.println(maxSum);
    }

    private static int determineMax(int max, int num){
        return max > num ? max : num;
    }

}
