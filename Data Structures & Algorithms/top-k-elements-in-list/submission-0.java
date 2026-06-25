class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();

        for(int i=0; i<nums.length; i++) {
            if(!hm.containsKey(nums[i])) {
                hm.put(nums[i], 1);
            } else {
                hm.put(nums[i], hm.get(nums[i])+1);
            }

        }
        LinkedHashMap<Integer, Integer> reversedByValHm = hm.entrySet().stream().sorted(
            Map.Entry.comparingByValue(Comparator.reverseOrder())
        ).collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (e1, e2) -> e1,
            LinkedHashMap::new
        ));
        int[] mostFreqEle = new int[k];
        int count =0;
        for(Map.Entry<Integer, Integer> entry : reversedByValHm.entrySet()) {
            if(count == k) break;
            mostFreqEle[count] = entry.getKey(); 
            count++;
        }

        return mostFreqEle;
    }
}
