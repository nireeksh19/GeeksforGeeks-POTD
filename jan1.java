class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        int n = nums.length;
        int zeroReminder=0;
        if(n%2==1) return false;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            if(i%k==0){
                zeroReminder++;
                continue;
            }
            int target = k-(i%k);
            if(mp.containsKey(target)){
                int freq = mp.get(target);
                if(freq==1){
                    mp.remove(target);
                }
                else{
                    mp.put(target,freq-1);
                }
            }
            else{
                mp.put(i%k,mp.getOrDefault(i%k,0)+1);
            }
        }
        return mp.size()==0 && zeroReminder%2==0;
    }
}