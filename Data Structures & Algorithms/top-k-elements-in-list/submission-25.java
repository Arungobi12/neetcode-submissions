class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[k];

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int i = 0;
        while(i<k){
            int j = 0;
            int max = -1;
            int l = Integer.MIN_VALUE;

            while(j<nums.length){
                if(map.containsKey(nums[j])){
                    if(map.get(nums[j]) > l){
                        max = nums[j];
                        l = map.get(nums[j]);
                    }
                }
                j++;
            }
            arr[i] = max;
            map.remove(max);
            i++;
        }
        return arr;
    }
}
