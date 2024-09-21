package Arrays;

import java.util.Scanner;

public class TwoPointerArray {
    public static void sort(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] == 1 && nums[right] == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            if (nums[left] == 0) {
                left++;
            }
            if (nums[right] == 1) {
                right--;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] array=new int[n];
        System.out.println("Enter the element in array only 0 and 1");
        for (int i = 0; i < n; i++) {
            array[i]=input.nextInt();
        }
        sort(array);
        for(int k: array){
            System.out.print(" "+k);
        }

    }
}
