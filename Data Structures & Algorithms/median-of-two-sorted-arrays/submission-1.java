class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] lintu = new int[nums1.length + nums2.length];
        for(int i = 0; i<nums1.length;i++) {lintu[i] = nums1[i];}
        for(int i = 0; i<nums2.length;i++) {lintu[nums1.length + i] = nums2[i];}
        Arrays.sort(lintu);
        int length = lintu.length;
        int median = length/2;
        if(length % 2 == 0)
        {
            return (lintu[median-1] + lintu[median]) / 2.0;
        }
        else
        {
            return lintu[median];
        }
    }
}
