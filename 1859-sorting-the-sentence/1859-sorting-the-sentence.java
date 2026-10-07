class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        int n=1;
        for(int i=0; i< arr.length; i++ ){
            for(int j=0; j< arr.length; j++ ){
                if(n == arr[j].charAt((arr[j].length() -1) ) - '0'){
                    sb.append(arr[j].substring(0 , arr[j].length() - 1));
                    sb.append(" ");
                    n++;
                    break;
                }
            }

        }
        return sb.toString().trim();
    }
}