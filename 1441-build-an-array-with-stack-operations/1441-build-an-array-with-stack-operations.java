class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<>();
        int last=target[target.length-1];
        int k=0;
        for(int i=1;i<=last;i++){
            if(i==target[k]){
                list.add("Push");
                k++;
            } else {
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}