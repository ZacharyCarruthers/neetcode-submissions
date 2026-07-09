class Solution {
    public int search(int[] nums, int target) {
        
            int index = nums.length / 2;
            int leftBound = 0;
            int rightBound = nums.length - 1;
            int updates = 0;

            do{

                if(nums[index] == target){
                    return index;
                } else if (nums[index] < target){
                    leftBound = index + 1;
                } else if (nums[index] > target){
                    rightBound = index - 1;
                }

                index = leftBound + ((rightBound - leftBound) / 2);

                updates++;

            } while(leftBound <= rightBound);

            return -1;


    }
}
