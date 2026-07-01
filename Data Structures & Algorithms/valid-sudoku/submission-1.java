class Solution {
    public boolean isValidSudoku(char[][] board) {
        int count=0;
        for(int k=0; k<board.length/3; k++) {
            HashSet<Character> hs = new HashSet<>();
            for(int i=0; i<board.length; i++) {
                if(i%3==0) {
                    hs.clear();
                } 
                for(int j=count; j<count+3; j++) {
                    if(Character.isDigit(board[i][j])) {
                        if(!hs.add(board[i][j])) {
                            return false;
                        }
                    }
                }
            }
            count = count+3;

        }


        for(int i=0; i<board.length; i++) {
            HashSet<Character> hs1 = new HashSet<>();
            HashSet<Character> hs2 = new HashSet<>();
            for (int j=0; j<board.length; j++) {
                if(Character.isDigit(board[i][j])) {
                    if(!hs1.add(board[i][j])) {
                        return false;
                    }
                }
                if(Character.isDigit(board[j][i])) {
                    if(!hs2.add(board[j][i])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
