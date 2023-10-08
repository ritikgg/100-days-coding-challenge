class RandomizedSet {
    private ArrayList<Integer> list;
    private HashMap<Integer, Integer> valToIndex;
    private Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        valToIndex = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (valToIndex.containsKey(val))
            return false;

        valToIndex.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (valToIndex.containsKey(val)) {
            int index = valToIndex.get(val);
            int lastElement = list.get(list.size() - 1);

            // Swap the element to remove with the last element
            list.set(index, lastElement);
            valToIndex.put(lastElement, index);

            // Remove the last element
            list.remove(list.size() - 1);
            valToIndex.remove(val);
            return true;
        }

        return false;
    }

    public int getRandom() {
        int index = rand.nextInt(list.size());
        return list.get(index);
    }
}
