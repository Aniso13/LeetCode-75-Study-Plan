class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int i = 0;
        for(int j = 1; j < n; j++) {
            boolean flag = true;
            while(i >= 0 && asteroids[i] > 0 && asteroids[j] < 0) {
                if(asteroids[i] == Math.abs(asteroids[j])) {
                    i--;
                    flag = false;
                    break;
                }
                else if(asteroids[i] < Math.abs(asteroids[j])) {
                    i--;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag) {
                asteroids[++i] = asteroids[j];
            }
        }

        return Arrays.copyOf(asteroids, i + 1);
    }
}