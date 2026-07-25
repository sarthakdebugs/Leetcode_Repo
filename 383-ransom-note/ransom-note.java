class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> count = new HashMap<>();
        
        for (char c : magazine.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        for (char c : ransomNote.toCharArray()) {
            int freq = count.getOrDefault(c, 0);
            if (freq == 0) return false;
            count.put(c, freq - 1);
        }
        
        return true;
    }
}