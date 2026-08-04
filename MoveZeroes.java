public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int[] temp = new int[nums.length];

        int index = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                temp[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }


    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.print("Array after moving zeroes: ");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}