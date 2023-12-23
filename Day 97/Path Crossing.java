public class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        int x = 0, y = 0;
        visited.add("0,0");

        for (char direction : path.toCharArray()) {
            switch (direction) {
                case 'N': y++; break;
                case 'S': y--; break;
                case 'E': x++; break;
                case 'W': x--; break;
            }

            String currentPos = x + "," + y;
            if (!visited.add(currentPos)) {
                return true;
            }
        }

        return false;
    }
}
