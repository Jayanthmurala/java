// package leetCode_Day_3;

// import java.lang.reflect.Array;
// import java.util.Arrays;

// public class Start_and_End {

//     // public static void main(String[] args) {
//     //     int[] list = {1,2,3,4,5,6,7,7,7,9};
//     //     Start_and_End nc = new Start_and_End();
//     //     System.out.println(Arrays.toString(nc.searchRange(list, 7)));
//     // }

//     public int[] searchRange(int[] nums, int target) {

//         int[] ans = { -1, -1 };
//         // check for first occurrence if target first
//         ans[0] = search(nums, target, true);
//         if (ans[0] != -1) {
//             ans[1] = search(nums, target, false);
//         }
//         return ans;
//     }

//     // this function just returns the index value of target
//     int search(int[] nums, int target, boolean findStartIndex) {
//         int ans = -1;
//         int start = 0;
//         int end = nums.length - 1;
//         while (start <= end) {
//             // find the middle element
//             // int mid = (start + end) / 2; // might be possible that (start + end) exceeds
//             // the range of int in java
//             int mid = start + (end - start) / 2;

//             if (target < nums[mid]) {
//                 end = mid - 1;
//             } else if (target > nums[mid]) {
//                 start = mid + 1;
//             } else {
//                 // potential ans found
//                 ans = mid;
//                 if (findStartIndex) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             }
//         }
//         return ans;
//     }
// }
