class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        int num = num_list.length;
        
        if(num % n == 0) {
            answer = new int[num / n];
        } else {
            answer = new int[num / n + 1];
        }
        
        int idx = 0;
        
        for(int i = 0; i < num; i += n) {
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}