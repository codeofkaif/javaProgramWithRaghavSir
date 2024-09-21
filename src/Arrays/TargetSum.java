package Arrays;



public class TargetSum {
    public static int Target(int[] array, int value){
        int numberOfPairs=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]+array[j]==value){
                    numberOfPairs++;
                }
        }

        }
        return numberOfPairs;
    }

    public static void main(String[] args) {

        int[] array={2,5,1,4,6,7,8,9};
        int number=7;
        int num=Target(array,number);
        System.out.printf("Total number of pairs in array: %d",num);

    }
}
