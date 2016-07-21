//46

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileInputStream;
import java.io.IOException;

public class TicTacToe {
	private static List<Character> board = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int tie = 0;
            char playerTurn;
            board.clear();
            board.addAll(Collections.nCopies(10, '\u0000'));
            int[] moves = new int[9];
            for (int j = 0; j < 9; j++) {
                moves[j] = in.nextInt();
            }
            for (int j = 0; j < 9; j++) {
                int moveOnBoard = moves[j];
                if (j%2 == 0) {
                    playerTurn = 'X';
                    board.set(moveOnBoard, playerTurn);
                    if (winChecker(playerTurn, moveOnBoard)) {
                        tie = j+1;
                        //System.out.println(tie);
                        break;
                    }
                } else {
                    playerTurn = 'O';
                    board.set(moveOnBoard,playerTurn);
                    if (winChecker(playerTurn, moveOnBoard)) {
                        tie = j+1;
                        //System.out.println(tie);
                        break;
                    }
                }
            }
            System.out.println(tie);
        }
		in.close();
	}

	private static boolean winChecker(char playerTurn, int moveOnBoard) {
        switch (moveOnBoard) {
            case 1: if ((playerTurn == board.get(5) && playerTurn == board.get(9)) ||
                    (playerTurn == board.get(4) && playerTurn == board.get(7)) ||
                    (playerTurn == board.get(2) && playerTurn == board.get(3))) {
                return true;
            } else {
                return false;
            }
            case 2: if ((playerTurn == board.get(5) && playerTurn == board.get(7)) ||
                    (playerTurn == board.get(1) && playerTurn == board.get(3))) {
                return true;
            } else {
                return false;
            }
            case 3: if ((playerTurn == board.get(5) && playerTurn == board.get(7)) ||
                    (playerTurn == board.get(6) && playerTurn == board.get(9)) ||
                    (playerTurn == board.get(1) && playerTurn == board.get(2))) {
                return true;
            } else {
                return false;
            }
            case 4: if ((playerTurn == board.get(1) && playerTurn == board.get(7)) ||
                    (playerTurn == board.get(5) && playerTurn == board.get(6))) {
                return true;
            } else {
                return false;
            }
            case 5: if ((playerTurn == board.get(1) && playerTurn == board.get(9)) ||
                    (playerTurn == board.get(3) && playerTurn == board.get(7)) ||
                    (playerTurn == board.get(2) && playerTurn == board.get(8)) ||
                    (playerTurn == board.get(4) && playerTurn == board.get(6))) {
                return true;
            } else {
                return false;
            }
            case 6: if ((playerTurn == board.get(3) && playerTurn == board.get(9)) ||
                    (playerTurn == board.get(5) && playerTurn == board.get(4))) {
                return true;
            } else {
                return false;
            }
            case 7: if ((playerTurn == board.get(3) && playerTurn == board.get(7)) ||
                    (playerTurn == board.get(1) && playerTurn == board.get(4)) ||
                    (playerTurn == board.get(8) && playerTurn == board.get(9))) {
                return true;
            } else {
                return false;
            }
            case 8: if ((playerTurn == board.get(2) && playerTurn == board.get(5)) ||
                    (playerTurn == board.get(7) && playerTurn == board.get(9))) {
                return true;
            } else {
                return false;
            }
            case 9: if ((playerTurn == board.get(1) && playerTurn == board.get(5)) ||
                    (playerTurn == board.get(3) && playerTurn == board.get(6)) ||
                    (playerTurn == board.get(7) && playerTurn == board.get(8))) {
                return true;
            } else {
                return false;
            }
            default: return false;
        }
    }

}