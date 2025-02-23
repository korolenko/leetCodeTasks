package topInterview150;

public class MergeSortedArray88 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,7,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge(nums1,4,nums2,3);
        System.out.println("sdsd");
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[nums1.length];
        int i = 0;
        int j = 0;
        while (i<m || j<n){
            if((nums1[i] <= nums2[j]) && (i<m)){
                res[i+j] = nums1[i];
                i++;
            } else {
                res[i+j] = nums2[j];
                j++;
            }
        }

        nums1 = res;
    }
}
