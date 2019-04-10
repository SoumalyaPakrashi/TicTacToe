package com.soumalyapakrashi.tictactoe;

public class WinLogic {
    // Array which contains the matrix representation of the grid
    private static short matrix[] = new short[9];
    private static short player1Moves = 0, player2Moves = 0;


    // Function which updates the matrix. It is called whenever user provides an input to the grid
    static void updateMatrix(Turn player, int grid) {
        if(player == Turn.PLAYER1) {
            matrix[grid - 1] = 1;
            player1Moves++;
        }
        else if(player == Turn.PLAYER2) {
            matrix[grid - 1] = 2;
            player2Moves++;
        }
    }


    // Function to reset the matrix
    static void resetMatrix() {
        for(int index = 0; index < 9; index++) {
            matrix[index] = 0;
        }
    }


    /* Function which checks whether any player has won or not
       Returns player number who has won. Else returns -1
    */
    static int checkWin() {
        if(player1Moves >= 3  &&  player2Moves >= 3) {
            // For player 1
            if(matrix[0] == 1  &&  matrix[1] == 1  &&  matrix[2] == 1)   return 1;
            else if(matrix[3] == 1  &&  matrix[4] == 1  &&  matrix[5] == 1) return 1;
            else if(matrix[6] == 1  &&  matrix[7] == 1  &&  matrix[8] == 1) return 1;
            else if(matrix[0] == 1  &&  matrix[3] == 1  &&  matrix[6] == 1) return 1;
            else if(matrix[1] == 1  &&  matrix[4] == 1  &&  matrix[7] == 1) return 1;
            else if(matrix[2] == 1  &&  matrix[5] == 1  &&  matrix[8] == 1) return 1;
            else if(matrix[0] == 1  &&  matrix[4] == 1  &&  matrix[8] == 1) return 1;
            else if(matrix[2] == 1  &&  matrix[4] == 1  &&  matrix[6] == 1) return 1;

            // For player 2
            if(matrix[0] == 2  &&  matrix[1] == 2  &&  matrix[2] == 2)   return 2;
            else if(matrix[3] == 2  &&  matrix[4] == 2  &&  matrix[5] == 2) return 2;
            else if(matrix[6] == 2  &&  matrix[7] == 2  &&  matrix[8] == 2) return 2;
            else if(matrix[0] == 2  &&  matrix[3] == 2  &&  matrix[6] == 2) return 2;
            else if(matrix[1] == 2  &&  matrix[4] == 2  &&  matrix[7] == 1) return 2;
            else if(matrix[2] == 2  &&  matrix[5] == 2  &&  matrix[8] == 2) return 2;
            else if(matrix[0] == 2  &&  matrix[4] == 2  &&  matrix[8] == 2) return 2;
            else if(matrix[2] == 2  &&  matrix[4] == 2  &&  matrix[6] == 2) return 2;
        }

        return -1;
    }
}
