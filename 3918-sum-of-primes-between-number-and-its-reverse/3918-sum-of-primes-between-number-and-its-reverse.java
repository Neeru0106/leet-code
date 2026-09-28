class Solution {
    List<Integer> simpleS(int n){
        boolean[] b=new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(!b[i]){
                for(int j=i*i;j<=n;j+=i){
                    b[j]=true;
                }
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(!b[i]){
                list.add(i);
            }
        }
        return list;
    }
    int SegmentedSeive(int L,int R){
        boolean[] range=new boolean[R-L+1];
        int limit=(int)Math.sqrt(R);
        List<Integer> list=simpleS(limit);
        for(int p: list){
            int firstM=((L+p-1)/p)*p;
            int start=Math.max(firstM,p*p);
            for(int j=start;j<=R;j+=p){
                range[j-L]=true;
            }
        }
        if(L==1){
            range[0]=true;
        }
        int sum=0;
        for(int i=0;i<R-L+1;i++){
            if(!range[i]){
                sum+=(L+i);
            }
        }
        return sum;
    }
    public int sumOfPrimesInRange(int n) {
        int temp=n;
        int rev=0;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+(rem);
            temp/=10;
        }
        int min=Math.min(rev,n);
        int max=Math.max(rev,n);
        return SegmentedSeive(min,max);
    }
}