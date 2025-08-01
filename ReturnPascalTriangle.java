class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();  // Initialize the result list to store all rows
        for(int i = 0; i < numRows; i++){
            List<Integer> CurrRow = new ArrayList<>();   //Create a new list for the current row
            int n=1;        //The first element of every row is always 1
            for(int j = 0; j <= i; j++){
                row.add(n);     // Add the current value to the row
              
               // Computing the next value using binomial coefficient formula:
                // C(i, j+1) = C(i, j) * (i - j) / (j + 1)
                n=n*(i-j)/(j+1);
            }
          
            res.add(row);
        }
        return res;
        
    }
}
