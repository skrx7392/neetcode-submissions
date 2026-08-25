class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            if(!countMap.containsKey(nums[i])) {
                countMap.put(nums[i], 1);
            }
            else {
                int count = countMap.get(nums[i]);
                countMap.put(nums[i], count+1);
            }
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(
            (a,b) -> Integer.compare(countMap.get(a), countMap.get(b))
        );
        for(int key : countMap.keySet()) {
            if(queue.size() < k) {
                queue.add(key);
            }
            else if(countMap.get(queue.peek()) < countMap.get(key)) {
                queue.poll();
                queue.add(key);
            }
        }
        int[] result = new int[k];
        for(int i=0; i<k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }
}
