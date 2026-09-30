class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5=0;
        int count10=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                count5++;
            }
            if(bills[i]==10){
                if(count5==0){
                    return false;
                }
                count10++;
                count5--;
            }
            if(bills[i]==20){
                if((count10<1 && count5<3)||(count5<1)){
                    return false;
                }
                else if(count10>0){
                    count10--;
                    count5--;
                } else{
                    count5-=3;
                }
            }
        }
        return true;
    }
}