package leetCode.medianofTwoSortedArrays;

public class Solution {
    int k = 0;
    int i = 0;
    int j = 0;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lenthResultMas = nums1.length + nums2.length;
        int mergeMas[] = new int[lenthResultMas];
        while (i < nums1.length & j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                mergeMas[k] = nums1[i];
                ++i;
            } else {
                mergeMas[k] = nums2[j];
                ++j;
            }
            ++k;
        }
        while (i < nums1.length) {
            mergeMas[k] = nums1[i];
            ++k;
            ++i;
        }
        while (j < nums2.length) {
            mergeMas[k] = nums2[j];
            ++k;
            ++j;
        }
        return mediane(mergeMas, mergeMas.length);
    }

    public double mediane(int mas[], int length) {
        double med = 0;
        if (length % 2 == 0) {
            med = (double) (mas[length/2] + mas[(length/2) - 1]) / (double) 2;
        } else {
            med = mas[length / 2];
        }
        return med;
    }
}
