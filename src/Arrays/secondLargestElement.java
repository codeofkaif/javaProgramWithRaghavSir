package Arrays;



public class secondLargestElement {
    public static int SLargest(int[] array){
        int firstL = Integer.MIN_VALUE;
        int secondL = Integer.MIN_VALUE;
        for (int j : array) {
            if (firstL < j) {
                secondL = firstL;
                firstL = j;
            } else if (secondL < j) {
                secondL = j;

            }

        }
        return secondL;

    }

    public static void main(String[] args) {
        int[] array={-3,-6,-4,-2,-7,-9,1,0};
        int result=SLargest(array);
        System.out.printf("Second Largest: %d",result);
    }


}
