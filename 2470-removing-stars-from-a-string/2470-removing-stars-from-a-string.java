class Solution {
    public String removeStars(String s) {
       char[] arr = s.toCharArray();
       int l = 0;

       for(int r = 0;r<arr.length;r++){
        if(arr[r] == '*'){
            l--;
        }
        else{
            arr[l] = arr[r];
            l++; 
        }
       }

       return new String(arr,0,l);
}
}