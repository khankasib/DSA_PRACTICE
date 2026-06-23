class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            int[] arr= new int[26];
            for(char c: str.toCharArray()){
                arr[c-'a']++;
            }
            StringBuilder key=new StringBuilder();
            for(int i:arr){
                key.append(i).append('#');
            }
            map.computeIfAbsent(key.toString(),k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
