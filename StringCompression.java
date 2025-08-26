class Solution {
    public String compressedString(String word) {
        StringBuilder result = new StringBuilder();

        Integer cnt = 1;
        for(int i = 0; i < word.length(); i++){
            while(i < word.length()-1 && word.charAt(i) == word.charAt(i+1) && cnt < 9){
                cnt++;
                i++;
            }
            
            result.append(cnt.toString());
            result.append(word.charAt(i));

            //reset counter
            cnt = 1;
        }

        return result.toString();
    }
}
