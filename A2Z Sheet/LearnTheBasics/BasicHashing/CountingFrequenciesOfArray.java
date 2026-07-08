class CountingFrequenciesOfArray {
    public List<List<Integer>> countFrequencies(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num))
            map.put(num,map.get(num)+1);
            else
            map.put(num,1);
        }

        List<List<Integer>> ans=new ArrayList<>();
        for(int key:map.keySet()){
        List<Integer> list=new ArrayList<>();
        list.add(key);
        list.add(map.get(key));
        ans.add(list);
        }
        return ans; 
    }
}
