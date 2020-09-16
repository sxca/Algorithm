public class S_11 {
    public int minArray(int[] numbers) {

        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i+1] < numbers[i])
                return numbers[i+1];
        }
        return numbers[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5,1,2};
        int[] nums2 = new int[]{2,2,2,0,1};
        S_11 s = new S_11();
        System.out.println(s.minArray(nums));
        System.out.println(s.minArray(nums2));
    }
}
