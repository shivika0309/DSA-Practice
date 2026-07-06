// Brute Force Approach - Sort the intervals, then for each interval merge all overlapping intervals by checking subsequent intervals. Time: O(n²) | Space: O(n)

// Optimal Approach - Sort the intervals by start time and merge overlapping intervals in a single traversal. Time: O(n log n) | Space: O(n)class Solution {
   class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> ans=new ArrayList<>();
        int start=0;
        int end=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=intervals[end][1]){
               if(intervals[i][1] > intervals[end][1])
                end = i;
            }

            else{
                ans.add(new int[]{intervals[start][0],intervals[end][1]});
                start=i;
                end=i;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        ans.add(new int[]{intervals[start][0],intervals[end][1]});
        
        return ans.toArray(new int[ans.size()][]);
        }
    }
