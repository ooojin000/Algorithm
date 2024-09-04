class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int multiply = 1;
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            multiply *= arr[i];
            sum += arr[i];
        }
        
        sum *= sum;
        
        if(multiply < sum) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}