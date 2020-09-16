/**
 * @Author SXC
 * @Date 2020/9/15 9:08
 **/
public class S_33 {
    public boolean verifyPostorder(int[] postorder) {
        return isPostorder(postorder, 0, postorder.length - 1);
    }

    public boolean isPostorder(int[] postorder, int i, int j) {
        if (i >= j ) {
            return true;
        }
        int k = i;
        while (k < j && postorder[k] < postorder[j]) {
            k++;
        }
        int l = k;
        while (l < j && postorder[l] > postorder[j]) {
            l++;
        }
        if (l != j){
            return false;
        }
        return isPostorder(postorder, i, k - 1) && isPostorder(postorder, k, j - 1);

    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 6, 3, 2, 5};
        System.out.println(new S_33().verifyPostorder(a));
    }
}
