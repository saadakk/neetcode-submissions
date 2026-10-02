class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> CharCounter  = new HashMap();
        for(int i = 0 ; i < s.length() ; i++ ){
            char a = s.charAt(i);
            char b = t.charAt(i);;
            CharCounter.put(a , CharCounter.getOrDefault(a , 0) + 1);
            CharCounter.put(b , CharCounter.getOrDefault(b , 0) - 1);
        }
        
        for(int value : CharCounter.values()){
             if (value != 0) return false;
        }
        return true;
    }
}
