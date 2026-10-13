import java.util.*;
class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> list1=new ArrayList<>();
         List<String> list2=new ArrayList<>();
          List<String> list3=new ArrayList<>();
           List<String> list4=new ArrayList<>();
        int n=isActive.length;
        for(int i=0;i<n;i++){
            if(isActive[i]){
                if(businessLine[i].equals("electronics") || businessLine[i].equals("grocery") || businessLine[i].equals("pharmacy") || businessLine[i].equals("restaurant") ){
                    if(!code[i].matches(".*[^a-zA-Z0-9_].*") && code[i].length()>0){
                        if(businessLine[i].equals("electronics")){
                            list1.add(code[i]);
                        } else if(businessLine[i].equals("grocery")){
                            list2.add(code[i]);
                        } else if(businessLine[i].equals("pharmacy")){
                            list3.add(code[i]);
                        } else{
                            list4.add(code[i]);
                        }
                    }
                }
            }
        }
        list1.sort(null);
        list2.sort(null);
        list3.sort(null);
        list4.sort(null);
        List<String> list=new ArrayList<>();
        for(int i=0;i<list1.size();i++){
            list.add(list1.get(i));
        }
        for(int i=0;i<list2.size();i++){
            list.add(list2.get(i));
        }
        for(int i=0;i<list3.size();i++){
            list.add(list3.get(i));
        }
        for(int i=0;i<list4.size();i++){
            list.add(list4.get(i));
        }
        return list;
    }
}