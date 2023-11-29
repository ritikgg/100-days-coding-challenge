import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        for (int i = 0; i <= rowIndex; i++) {
            row.add(0, 1); // add 1 to staring of the row
            
            for (int j = 1; j < row.size() - 1; j++) {
                // update elements in middle of the row
                row.set(j, row.get(j) + row.get(j + 1));
            }
        }
        
        return row;
    }
}
