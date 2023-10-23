class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0; //pointer a
        int b = numbers.length - 1; //pointer b

        while(a <= b){
            int sum = numbers[a] + numbers[b];
            if(sum > target){
                b--;
            }
            else if(sum < target){
                a++;
            }
            else{
                return new int[] {a +1, b+1};
            }
        }
        return new int [] {a+1 , b+1};
    }
}
