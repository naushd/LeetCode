class RandomizedSet {

   Map<Integer, Integer> map;
    List<Integer> nums;
    Random rand;


    public RandomizedSet() {
        map = new HashMap<>();
        nums = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        nums.add(val);
        map.put(val, nums.size()-1);
        return true;
        
    }
    
    public boolean remove(int val) {

        if(!map.containsKey(val)){
            return false;
        }

        int idx = map.get(val);
        int last = nums.get(nums.size()-1);

        nums.set(idx, last);
        map.put(last, idx);
        map.remove(val);
        nums.remove(nums.size()-1);

        return true;


        
    }
    
    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}


/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */