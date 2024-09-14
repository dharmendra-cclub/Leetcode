class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0)   return 0;
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 0; i < s.length; i++)
            li.add(s[i]);
        Iterator<Integer> it = li.iterator();
        for(int i = 0; i < g.length; i++)
        {
             while (it.hasNext()) {
                int j = it.next();
                if (g[i] <= j) {
                    count++;
                    break;
                }
                it.remove();
            }
        }

        return count;
    }
}