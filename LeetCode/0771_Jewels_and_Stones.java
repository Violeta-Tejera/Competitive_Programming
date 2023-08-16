class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelsSet = new HashSet<>();

        // Init the hashset:
        for(int i = 0; i < jewels.length(); i++){
            jewelsSet.add(jewels.charAt(i));
        }

        // Identify all jewels:
        int num = 0;

        for(int i = 0; i < stones.length(); i++){
            if(jewelsSet.contains(stones.charAt(i)) == true){
                num++;
            }
        }

        return num;
    }
}
