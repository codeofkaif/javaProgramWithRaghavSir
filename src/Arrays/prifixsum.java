package Arrays;

public class prifixsum {
    public static void makePrefixArray( int[] nums){
        for (int i = 1; i < nums.length; i++) {
            nums[i]=nums[i-1]+nums[i];

        }
    }

    public static void main(String[] args) {
        int[] array={4,5,6,2,4,7};
        for(int n: array)
            System.out.print(" "+n+"\n");
        makePrefixArray(array);
        for(int k: array){
            System.out.print(" "+k);
        }
    }
}
