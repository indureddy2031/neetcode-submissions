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
        int i=0, j=0;
        while(i<str.length()) {
            j = i;
            while(str.charAt(i) != '#') {
                i++;
            }
            int length = Integer.parseInt(str.substring(j,i));
            strs.add(str.substring(i+1,i+length+1));
            i = i+length+1;
        }
        return strs;
    }
}
