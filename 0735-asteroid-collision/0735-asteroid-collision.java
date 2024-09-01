class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> li = new ArrayList<>();
        
        int j = 0;
        for(int i = 0; i < asteroids.length; i++)
        {
            if(asteroids[i] > 0)
                li.add(asteroids[i]);
            else
            {
                while(!li.isEmpty() && li.getLast() < Math.abs(asteroids[i]))
                    li.remove(li.size() - 1);
                if(!li.isEmpty() && li.getLast() == Math.abs(asteroids[i]))
                    li.remove(li.size() - 1);
                else if(li.isEmpty())
                    li.add(asteroids[i]);
            }
        }
        int ans[] = new int[li.size()];
        for(int i: li)
            ans[j++] = i;
        
        return ans;
    }
}