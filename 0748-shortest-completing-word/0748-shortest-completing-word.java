class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate=licensePlate.toLowerCase();
        int[] org=new int[26];
        int n=licensePlate.length();
        int count=0;
        List<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(licensePlate.charAt(i)>='a'){
                org[licensePlate.charAt(i)-'a']++;
                count++;
            }
        }
        int i=0;
        int m=words.length;
        while(i<m){
            if(words[i].length()>=count){
                int[] copy=new int[26];
                int k=words[i].length();
                for(int l=0;l<k;l++){
                    copy[words[i].charAt(l)-'a']++;
                }
                boolean check=false;
                for(int l=0;l<26;l++){
                    if(copy[l]<org[l]){
                        check=true;
                        break;
                    }
                }
                if(!check){
                    list.add(words[i]);
                    if(k==count){
                        return words[i];
                    }
                }
            }
            i++;
        }
        int min=Integer.MAX_VALUE;
        String a=new String("");
        for(String s:list){
            int z=s.length();
            if(z<min){
                min=z;
                a=s;
            }
        }
        return a;
    }
}