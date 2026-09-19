class Solution {
    public String greatestLetter(String s) {  
    	char lowercaseLetter = 'z';
    	char uppercaseLetter = 'Z';
    	for (int i = 26; i >= 1; i--) {
        	if (s.indexOf(lowercaseLetter) != -1 && 
        		s.indexOf(uppercaseLetter) != -1) {
        		return String.valueOf(uppercaseLetter);
        	}
        	lowercaseLetter--;
        	uppercaseLetter--;
        }
    	return "";
    }
}