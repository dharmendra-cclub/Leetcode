class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i = 0, j = cardPoints.length - 1, sum = 0;
        for(int a = 0; a < k; a++)
        {
            if(cardPoints[i] > cardPoints[j])
            {
                sum = sum + cardPoints[i];
                i++;
            }
            else
            {
                sum = sum + cardPoints[j];
                j--;
            }
        }

        return sum;
    }
}