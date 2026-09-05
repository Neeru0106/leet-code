class Solution {
    public int compress(char[] chars) {
         StringBuilder s1=new StringBuilder();
         int i=0;
         int left=0;
         int n=chars.length;
         while(i<n){
            char c=chars[i];
            int count=0;
            while(i<n && chars[i]==c){
                count++;
                i++;
            }
            s1.append(c);
            if(count>1){
                s1.append(count);
            }
         }
        for(int j=0;j<s1.length();j++){
            chars[j]=s1.charAt(j);
        }
         return s1.length();
    }
}