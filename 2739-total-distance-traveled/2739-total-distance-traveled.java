class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if(mainTank>=5){
            return 50+((additionalTank>=1)?distanceTraveled(mainTank-5+1,additionalTank-1):distanceTraveled(mainTank-5,0));
        }
        else{
            return mainTank*10;
        }
    }
}