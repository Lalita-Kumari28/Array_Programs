package Rotation;

import java.util.Scanner;

public class Array_Rotation {
    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
 
    void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }
 
    /* utility function to print an array */
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
    // Driver program to test above functions
    public static void main(String[] args)
    {
    	Array_Rotation rotate = new Array_Rotation();
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        rotate.leftRotate(arr, 3, 7);
        rotate.printArray(arr, 7);
    }
}