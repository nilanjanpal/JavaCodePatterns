package org.example;

public class SlidingWindowPatternDynamic {

    public static void main(String args[]){
        int[] testArray = {1,20,0,3,2,10,0};
        int windowSize = 1;
        int sum = 0;
        int maxSum = 6;
        int maxLength = 0;
        int length = 0;
        int leftPointerPosition = 0;
        int rightPointerPosition = 0;
        while(rightPointerPosition < testArray.length){
            sum = sum + testArray[rightPointerPosition];
            if(sum <= maxSum){
                length++;
                maxLength = determineMax(maxLength, length);
                rightPointerPosition++;
            }
            if(sum > maxSum){
                while(sum > maxSum){
                    sum = sum - testArray[leftPointerPosition];
                    leftPointerPosition++;
                    length=0;
                    if(leftPointerPosition > rightPointerPosition){
                        rightPointerPosition++;
                    }
                }
            }
        }
        System.out.println(maxLength);
    }

    private static int determineMax(int max, int num){
        return max > num ? max : num;
    }

}
