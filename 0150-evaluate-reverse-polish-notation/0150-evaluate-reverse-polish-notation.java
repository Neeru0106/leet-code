class Solution {
    public int evalRPN(String[] tokens) {
        int i=0;
        int n=tokens.length;
        int[] freq=new int[n];
        int left=0;
        while(i<n){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*")|| tokens[i].equals("/")){
                if(tokens[i].equals("+")){
                    freq[left-2]=freq[left-2]+freq[left-1];
                }
                else if(tokens[i].equals("-")){
                    freq[left-2]=freq[left-2]-freq[left-1];
                }
                else if(tokens[i].equals("*")){
                    freq[left-2]=freq[left-2]*freq[left-1];
                }
                else if(tokens[i].equals("/")){
                    freq[left-2]=freq[left-2]/freq[left-1];
                }
                left--;
            } else{
                freq[left]=Integer.parseInt(tokens[i]);
                 left++;
            }
            i++;
        }
        return freq[0];
    }
}