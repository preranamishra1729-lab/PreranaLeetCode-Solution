class Solution {
    public int lengthOfLastWord(String s)
     {
        s = s.trim();
        int last_count =0;
       
        for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)==' '){
            break;
        }
            last_count++;
        
        }
    
    return last_count;
     }
}