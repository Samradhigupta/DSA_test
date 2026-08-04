public class singleNumber {
    
    public int findSingleNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return nums[i];
            }
        }

      
        return -1;
    }
    public static void main(String[] args) {
        singleNumber sn = new singleNumber();
        int[] nums = {4, 1, 2, 1, 2};
        int result = sn.findSingleNumber(nums);
        System.out.println("Single number: " + result);
    }
}