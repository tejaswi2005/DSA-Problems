class Solution {
    public List<String> validStrings(int n){
        List<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");
        q.add("0");

        while (!q.isEmpty()) {
            String curr = q.poll();

            if (curr.length() == n) {
                result.add(curr);
                continue;
            }

            // always can add "1"
            q.add(curr + "1");

            // add "0" only if last char is '1'
            if (curr.charAt(curr.length() - 1) == '1') {
                q.add(curr + "0");
            }
        }

        return result;
    }
} 
