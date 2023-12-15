import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> destinations = new HashSet<>();

        // Add all cities to the set
        for (List<String> path : paths) {
            destinations.add(path.get(1));
        }

        // Remove cities that are starting points
        for (List<String> path : paths) {
            destinations.remove(path.get(0));
        }

        // The remaining city is the destination city
        return destinations.iterator().next();
    }
}
