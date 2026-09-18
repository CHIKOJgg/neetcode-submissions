class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i<s.length(); i++)
        {
            Character currT  =t.charAt(i);
            Character currS  =s.charAt(i);
            map1.put(currT ,map1.getOrDefault(currT, 0)+1);
            map2.put(currS,map2.getOrDefault(currS, 0)+1);
           
        }
        if(map1.equals(map2)){
            return true;
        }
        return false;
    }
}
