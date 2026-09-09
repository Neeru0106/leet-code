class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=salary.length;
        for(int i=0;i<n;i++){
            if(salary[i]<min){
                min=salary[i];
            }
            if(max<salary[i]){
                max=salary[i];
            }
        }
        double sum=0;
        int count=0;
        for(int n1:salary){
            if(n1!=min && n1!=max){
                sum+=n1;
                count++;
            }
        }
        return sum/count;
    }
}