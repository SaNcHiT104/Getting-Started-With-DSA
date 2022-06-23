class Solution {
    public boolean isPalindrome(int x) {
       boolean neg = false;
        if(x<0){
            neg=true;
            return false;
        }
        int ans=0;
        int y =x;
        while(y!=0){
            int digit = y%10;
            y/=10;
            ans = ans*10 + digit;
        }
        System.out.println(ans);
        if(ans==x){
            return true;
        }
        else{
            return false;
        }
        
    }
}