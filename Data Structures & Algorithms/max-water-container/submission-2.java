class Solution {
    public int maxArea(int[] heights) {
        int maxArea=0;
        for(int i=0;i<heights.length-1;i++){
            for(int j=i+1;j<heights.length;j++){
                int area=Math.min(heights[i],heights[j])*(j-i);
                maxArea=Math.max(area,maxArea);
            }
        }
        return maxArea;
    }
}
