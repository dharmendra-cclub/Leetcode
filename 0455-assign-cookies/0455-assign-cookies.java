class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0)   return 0;
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 0; i < s.length; i++)
            li.add(s[i]);
        for(int i = 0; i < g.length; i++)
        {
            for(int j = 0; j < li.size(); j++)
            {
                if(g[i] <= li.get(j))
                {
                    count++;
                    li.remove(j);
                    break;
                }
            }
        }

        return count;
    }
}