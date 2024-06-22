class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int a[] = new int[arr[arr.length-1] + k];
        Arrays.fill(a, 0);

        for(int i = 0; i < arr.length; i++)
            a[arr[i]-1] = 1;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == 0)
            {
                count ++;
            }

            if(count == k)
            {
                return i+1;
            }
        }

        return -1;
        
    }
}