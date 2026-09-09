class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int leftIndex = 0;
        int rightIndex = heights.length - 1;
        while(leftIndex < rightIndex) {
            int area = Math.min(heights[leftIndex], heights[rightIndex]) * (rightIndex - leftIndex);
            maxArea = Math.max(area, maxArea);
            if(heights[leftIndex] < heights[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        return maxArea;
    }
}
