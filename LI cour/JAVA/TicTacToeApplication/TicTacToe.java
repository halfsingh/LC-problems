package TicTacToeApplication;

public class TicTacToe {
    protected char[] board;
    protected char userMarker;
    protected char aimarker;
    protected char winner;
    protected char currentMarker;

    public TicTacToe(char playerToken, char aimarker) {
        this.userMarker = playerToken;
        this.aimarker = aimarker;
        this.winner = '-';
        this.board = setBoard();
        this.currentMarker = this.userMarker;
    }

    private static char[] setBoard() {
        char[] board = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';

        }
        return board;
    }

    public boolean playTurn(int spot) {
        boolean isValid = withinRange(spot) && !isSpotTaken(spot);
        if (isValid) {
            board[spot - 1] = this.currentMarker;
            this.currentMarker = (this.currentMarker == this.userMarker) ? this.aimarker : this.userMarker;
        }
        return isValid;
    }

    private boolean isSpotTaken(int spot) {
        return board[spot - 1] != '-';
    }

    private boolean withinRange(int spot) {
        return spot > 0 && spot < board.length + 1;
    }

    public void printBoard() {
        // Attempting to crea8
        // | - | - | - |
        // --------------
        // | - | - | - |
        // --------------
        // | - | - | - |
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("--------------");
            }
            System.out.print(" | " + board[i]);
        }
        System.out.println();
    }

    public static void printIndexBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println();
                System.out.println("--------------");
            }
            System.out.print(" | " + (i + 1));
        }
        System.out.println();
    }

    public boolean isthereawinner() {
        boolean digonalsandmiddles = (rightdi() || leftdi() || secondcol()) && board[4] != '-';
        boolean topandfirst = (toprow() || firstcol()) && board[0] != '-';
        boolean bottomandthird = (bottomrow() || thirdcol()) && board[8] != '-';
        if (digonalsandmiddles) {
            this.winner = board[4];
        } else if (topandfirst) {
            this.winner = board[0];
        } else if (bottomandthird) {
            this.winner = board[8];
        }
        return digonalsandmiddles || topandfirst || bottomandthird;

    }

    public boolean toprow() {
        return board[0] == board[1] && board[1] == board[2];
    }

    public boolean middlerow() {
        return board[3] == board[4] && board[4] == board[5];
    }

    public boolean bottomrow() {
        return board[6] == board[7] && board[7] == board[8];
    }

    public boolean firstcol() {
        return board[0] == board[3] && board[3] == board[6];
    }

    public boolean secondcol() {
        return board[1] == board[4] && board[4] == board[7];
    }

    public boolean thirdcol() {
        return board[2] == board[5] && board[5] == board[8];
    }

    public boolean rightdi() {
        return board[0] == board[4] && board[4] == board[8];
    }

    public boolean leftdi() {
        return board[2] == board[4] && board[4] == board[6];
    }

    public boolean istheboardfilled() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == '-') {
                return false;
            }

        }
        return true;
    }

    public String gameover() {
        boolean didsomeonewin = isthereawinner();
        if (didsomeonewin) {
            return " We have a winner ! The winner is " + this.winner + 's';

        } else if (istheboardfilled()) {
            return "Draw";
        } else {
            return "notover";
        }
    }

}
