class Solution {
    public int maximum69Number (int num) {
        
        int cnt = 0;
        int placeValue = -1;
        int tempNum = num;


        while(tempNum > 0){
            int rem = tempNum  % 10;
            if(rem == 6){
                placeValue = cnt;
            }

            cnt++;
            tempNum  = tempNum / 10;
        }

        if(placeValue == -1){
            return num;
        } 
        
        return num + (int)(3 * Math.pow(10, placeValue));
       
    }
}
