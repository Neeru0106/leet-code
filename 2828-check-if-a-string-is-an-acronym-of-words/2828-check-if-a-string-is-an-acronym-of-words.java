class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder s1=new StringBuilder();
        for(String word:words){
            s1.append(word.charAt(0));
        }
        return s1.toString().equals(s);
    }
}