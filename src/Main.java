class Main {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int k=n+m;
        int total=k;
        int i=0;
        int j=0;
        int[] array=new int[k];
        int num=0;
        while(m>i &&n>j){
            if(nums1[i]<nums2[j]){
                array[num]=nums1[i];
                num++;
                i++;
            }
            else{
                array[num]=nums2[j];
                num++;
                j++;

            }
        }



        while(m>i){
            array[num]=nums1[i];
            num++;
            i++;
        }
        while(n>j){
            array[num]=nums2[j];
            num++;
            j++;
        }
        for(int s: array){
            System.out.println(s);
        }


        double median=0;
        if(total%2==0){
            int midIndex=total/2;
            return median=(double)(array[midIndex-1]+array[midIndex])/2;
        }
        else{
            int midIndex=total/2;
            return midIndex;
        }



    }

    public static void main(String[] args) {
        int[] arr1={1,3};
        int[] arr2={2};

        double k=findMedianSortedArrays(arr1,arr2);

    }
}
//// good approach
//class Solution {
//    public:
//    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
//        int n = nums1.size();
//        int m = nums2.size();
//        int i = 0, j = 0, m1 = 0, m2 = 0;
//
//        // Find median.
//        for (int count = 0; count <= (n + m) / 2; count++) {
//            m2 = m1;
//            if (i != n && j != m) {
//                if (nums1[i] > nums2[j]) {
//                    m1 = nums2[j++];
//                } else {
//                    m1 = nums1[i++];
//                }
//            } else if (i < n) {
//                m1 = nums1[i++];
//            } else {
//                m1 = nums2[j++];
//            }
//        }
//
//        // Check if the sum of n and m is odd.
//        if ((n + m) % 2 == 1) {
//            return static_cast<double>(m1);
//        } else {
//            double ans = static_cast<double>(m1) + static_cast<double>(m2);
//            return ans / 2.0;
//        }
//    }
//};

