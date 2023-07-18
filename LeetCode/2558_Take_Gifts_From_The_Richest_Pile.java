class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pqi = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int g: gifts) pqi.add(g);

        for(int i = 0; i < k; i++){
            int g = pqi.poll(); // Remove the root of the max heap
            g = (int) Math.sqrt(g);
            pqi.add(g);
        }

        long leftovers = 0;

        while(!pqi.isEmpty()) leftovers += pqi.poll();

        return leftovers;
    }
}
