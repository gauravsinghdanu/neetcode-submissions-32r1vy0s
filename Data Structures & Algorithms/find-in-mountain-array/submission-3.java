/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
       int n = mountainArr.length();
       int low = 0;
       int high = n-1;
       while(low < high){
        int mid = low + (high - low) / 2;
        if(mountainArr.get(mid) < mountainArr.get(mid + 1)){
            low = mid + 1;
        }else{
            high = mid;
        }
       }
       int peak = low;

       int result = leftSearch(mountainArr,target,0,peak);

       if(result!=-1){
        return result;
       }else{
        result = rightSearch(mountainArr,target,peak+1,n-1);
       }
       return result;
    }
    private int leftSearch(MountainArray arr,int target,int low,int high){
        while(low<=high){
            int mid = low + (high - low)/2;
            int val = arr.get(mid);

            if(val == target){
                return mid;
            }else if(val < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
    private int rightSearch(MountainArray arr,int target,int low,int high){
        while(low<=high){
            int mid = low + (high - low)/2;
            int val = arr.get(mid);

            if(val == target){
                return mid;
            }else if(val < target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}