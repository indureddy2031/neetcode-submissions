class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String sc = String.valueOf(c);
            if(!hm.containsKey(sc)) {
                hm.put(sc, new ArrayList<>());
            } 
            hm.get(sc).add(strs[i]);
            
        }
        return new ArrayList<>(hm.values());
    }
}
