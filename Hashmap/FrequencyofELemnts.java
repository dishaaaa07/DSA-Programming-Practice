/*
 * Problem Name: Frequency of Elements
 * Platform: GeeksforGeeks
 * Problem Number: Not specified
 * Difficulty: Easy
 * Problem Link:
 * https://www.geeksforgeeks.org/problems/frequency-of-elements--111353/0
 */
class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> ma = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            ma.put(arr[i], ma.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : ma.entrySet()) {
            ArrayList<Integer> im = new ArrayList<>();
            im.add(e.getKey());
            im.add(e.getValue());
            ans.add(im);
        }
        return ans;
    }
}