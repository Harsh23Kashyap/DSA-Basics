// Author: Huahua
class Solution 
{
  public int numOfSubarrays(int[] arr) {
    long ans = 0, odd = 0, even = 0;
    for (int x : arr) {
      even += 1;
      if (x % 2 == 1) {
        long t = even; even = odd; odd = t;
      }
      ans += odd;
    }
    return (int)(ans % (int)(1e9 + 7));
  }
}