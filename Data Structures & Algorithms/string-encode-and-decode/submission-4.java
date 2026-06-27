class Solution {

    public String encode(List<String> strs) {
        String s ="";
        for(int i=0; i<strs.size(); i++) {
            s += (strs.get(i).length())+"#"+strs.get(i);
        }
        return s;
    }



    public List<String> decode(String str) {
        ArrayList<String> strs = new ArrayList<>();
        if(str.length() == 0) return strs;
        int i=0, j=0;
        while(i<str.length()) {
            j = i;
            while(j<str.length() && str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            strs.add(str.substring(j+1,j+length+1));
            i = j+length+1;
        }
        return strs;
    }
}
