class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rowMap = new HashMap<>();
        HashMap<Integer, HashSet<Character>> columnMap = new HashMap<>();
        HashMap<Integer, HashSet<Character>> boxMap = new HashMap<>();
        for(int row = 0; row<board.length; row++) {
            for(int col = 0; col<board[row].length; col++) {
                char currentValue = board[row][col];
                if (currentValue == '.') {
                    continue;
                }
                HashSet<Character> rowSet = rowMap.getOrDefault(row, new HashSet<Character>());
                if (rowSet.contains(currentValue)) {
                    return false;
                } else {
                    rowSet.add(currentValue);
                    rowMap.put(row, rowSet);
                }
                HashSet<Character> colSet = columnMap.getOrDefault(col, new HashSet<Character>());
                if(colSet.contains(currentValue)) {
                    return false;
                } else {
                    colSet.add(currentValue);
                    columnMap.put(col, colSet);
                }
                int box = (row/3)*3 + col/3;
                HashSet<Character> boxSet = boxMap.getOrDefault(box, new HashSet<Character>());
                if(boxSet.contains(currentValue)) {
                    return false;
                } else {
                    boxSet.add(currentValue);
                    boxMap.put(box, boxSet);
                }
            }
        }

        return true;
    }
}
