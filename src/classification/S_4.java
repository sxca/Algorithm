package classification;

public class S_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int left = (l1 + l2 + 1) / 2;
        int right = (l1 + l2 + 2) / 2;

        return (getKth(nums1, 0, l1 - 1, nums2, 0, l2 - 1, left)
                + getKth(nums1, 0, l1 - 1, nums2, 0, l2 - 1, right)) / 2.0;
    }

    public int getKth(int[] num1, int start1, int end1, int[] num2, int start2, int end2, int k) {
        int l1 = end1 - start1 + 1;
        int l2 = end2 - start2 + 1;
        if (l1 > l2) {
            return getKth(num2, start2, end2, num1, start1, end1, k);
        }
        if (l1 == 0) {
            return num2[start2 + k - 1];
        }
        if (k == 1) {
            return Math.min(num1[start1], num2[start2]);
        }
        if (end1 - start1 > end2 - start2) {
            getKth(num2, start2, end2, num1, start1, end1, k);
        }
        int temp = Math.min(k/2, l1) - 1;
        if (num1[start1 + temp] <= num2[start2 + temp]) {
            return getKth(num1, start1 + temp + 1, end1, num2, start2, end2, k - temp - 1);
        } else {
            return getKth(num1, start1, end1, num2, start2 + temp + 1, end2, k - temp - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{2};
        int[] b = new int[0];
        System.out.println(new S_4().findMedianSortedArrays(a, b));
    }
}
