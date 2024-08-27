class Solution {
    public int solution(int[] arr, int n) {
        int answer = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == n) {
                answer = 1;
            }
        }
        
        return answer;
    }
}