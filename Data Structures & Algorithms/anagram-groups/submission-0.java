class Solution {

    public void initializeFreqArray(int[] charFreq){
        for(int i = 0; i < charFreq.length; i++){
                charFreq[i] = 0;
            }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
                Map<String, List<String>> res = new HashMap<>();
                int[] charFreq = new int[26];

                    initializeFreqArray(charFreq);

                    for(String str : strs){
                        for(int i = 0; i < str.length(); i++){
                            charFreq[str.charAt(i) - 'a']++;
                        }

                        String key = Arrays.toString(charFreq);
                        res.putIfAbsent(key, new ArrayList<>());
                        res.get(key).add(str);

                        initializeFreqArray(charFreq);

                    }
        
                    return new ArrayList<>(res.values());
    }
}