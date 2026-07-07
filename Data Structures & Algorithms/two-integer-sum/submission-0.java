class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>(nums.length);
        int[] answer = new int[2];
        

        for(int i = 0; i < nums.length; i++){

            int diff = target - nums[i];

            if(map.containsKey(diff)){
                    int answerOrder = map.get(diff);

                if(i > answerOrder){
                    answer[0] = answerOrder;
                    answer[1] = i;
                } else {
                answer[0] = i;
                answer[1] = answerOrder;
                }

                return answer;
            }

            map.put(nums[i], i);
        }
        return answer;
    }
}
