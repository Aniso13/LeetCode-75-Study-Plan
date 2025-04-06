class Solution {

    public boolean isVowel(char c) {
        if( c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int counter =0;
        for(int i = 0; i < k; i++)
        {
            if(isVowel(s.charAt(i)))
                counter++;
        }
        int maxlen = counter;

        for(int i = k ; i<s.length(); i++)
        {
            if(isVowel(s.charAt(i-k)))
                counter--;

            if(isVowel(s.charAt(i)))
                counter++;
            
            maxlen= Math.max(maxlen,counter);
        }
        return maxlen;
    }
}