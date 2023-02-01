public class game {

    private Character[][] board = new Character[10][10];

    public Character[][] getBoard() {
        return board;
    }

    //don't know if useful just copy paaste
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 0; i < nums.length-1;i++) {
            //System.out.println(nums[i]);
            int test = nums[i] + nums[i+1];

            if (test == target) {
                ans[0] = i;
                ans[1] = (i+1);
                return ans;
            }
        }
        return ans;
    }

    public void initializeBoard(Character[][] board, int numRows, int numColumns) {
        for (int i = 0; i < numRows; i++) {
            for(int j = 0; j < numColumns; j++) {
                board[i][j] = '~';
            }
        }
    }

    public void printBoard(int numRows, int numColumns) {
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                System.out.print("0  1  2  3  4  5  6  7  8  9  10\n");
            }
            for (int j = 0; j < numColumns; j++) {
                if (j == 0) {
                    System.out.print((i) + "  ");
                }
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }






}
