package LeetCode;


public class NondecreasingArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{-1, 4, 2, 3};
        System.out.println(checkPossibility(nums1));
    }

    public static boolean checkPossibility(int[] nums) {
        if (nums.length == 1 || nums.length == 2) {
            return true;
        }
        if (nums[0] > nums[1] && nums[0] > nums[2]) {
            nums[0] = 1;
            for (int i = 0; i <= nums.length - 2; i++) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i <= nums.length - 3; i++) {
                if (nums[i] > nums[i + 1]) {

                    if (nums[i] > nums[i + 2]) {
                        nums[i] = nums[i + 1];
                        for (i = 0; i <= nums.length - 1; i++) {
                            if (nums[i] > nums[i + 1]) {
                                return false;
                            }
                        }
                    } else {


                        nums[i + 1] = nums[i + 2];
                        for (i = 0; i <= nums.length - 1; i++) {
                            if (nums[i] > nums[i + 1]) {
                                return false;
                            }
                        }

                    }

                }
            }
        }
        return true;
    }
}
