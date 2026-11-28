class Solution {
    public boolean isAcronym(List<String> words, String s) {

        if(words.size()!=s.length()){
            return false;
        }

        int p=0;

        for(String i: words){

            if(s.charAt(p++)!=i.charAt(0)){
                return false;
            }
        }

        return true;


        
    }
}