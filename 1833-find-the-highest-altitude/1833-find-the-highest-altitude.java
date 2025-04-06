class Solution {
    public int largestAltitude(int[] gain) {
        int maxgain=0;
        int sum=0;
        for(int i: gain)
        {
            sum+=i;
            maxgain=Math.max(maxgain,sum);
        }
        return maxgain;
    }
}