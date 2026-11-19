class Solution {
    public String capitalizeTitle(String title) {
        String[] s=title.split(" ");
        StringBuilder s3=new StringBuilder();
        int n=s.length;
        for(int i=0;i<n;i++){
            char[] c=s[i].toCharArray();
            int n1=c.length;
            for(int j=0;j<n1;j++){
                if(n1>2 && j==0 && c[j]>='a'){
                    c[j]-=('a'-'A');
                }
                if(n1>2 && j>0 && c[j]<'a'){
                    c[j]-=('A'-'a');
                }
                if(n1<3 && c[j]<'a'){
                    c[j]-=('A'-'a');
                }
            }
            String s2=new String(c);
            s3.append(s2);
            s3.append(i == n - 1 ? "" : " ");
        }
        return s3.toString();
    }
}