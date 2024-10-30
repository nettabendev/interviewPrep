package codility.frogJumps;

class Solution {
    public int solution(int X, int Y, int D) {
        // Implement your solution here
        int ans =(Y-X)/D;
        if (Y != D*ans+X){
            ans++;
        }
        return ans;
    }
}
