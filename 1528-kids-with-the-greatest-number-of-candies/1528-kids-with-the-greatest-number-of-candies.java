
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int a : candies) {
            max = Math.max(max, a);
        }
        
        List<Boolean> res = new ArrayList<>(candies.length);
        for (int candy : candies) {
            res.add(candy + extraCandies >= max);
        }

        return res;
    }
}
