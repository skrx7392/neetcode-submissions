class Solution {
    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        maxLeft[0] = height[0];
        for(int i=1; i<height.length; i++) {
            maxLeft[i] = Math.max(maxLeft[i-1], height[i]);
        }
        int maxRight = 0;
        int water = 0;
        for(int i=height.length - 1; i>=0; i--) {
            maxRight = Math.max(maxRight, height[i]);
            water += Math.min(maxLeft[i], maxRight) - height[i];
        }
        return water;
    }
}
