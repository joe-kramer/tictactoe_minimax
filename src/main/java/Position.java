import java.util.List;
import java.util.LinkedList;

public class Position {

  public char[] board;
  public char turn;
  public int dim = 3;

  public Position() {
    this.board = "         ".toCharArray();
    this.turn = 'x';
  }

  public Position(char[] board, char turn) {
    this.board = board;
    this.turn = turn;
  }

  public Position(String str) {
    this.board = str.toCharArray();
    this.turn = 'x';
  }

  public boolean winLine(char turn, int start, int step) {
    for (int i = 0; i < 3; i++) {
      if (board[start + step*i] != turn) {
        return false;
      }
    }
    return true;
  }

  public boolean win(char turn) {
    for (int i = 0; i < dim; i++) {
      if(winLine(turn, i*dim, 1) || winLine(turn, i, dim)) {
        return true;
      }
    }
    if (winLine(turn, dim - 1, dim - 1) || winLine(turn, 0, dim + 1)) {
      return true;
    }
    return false;
  }

  public Position move(int i) {
    char[] newBoard = board.clone();
    newBoard[i] = this.turn;
    return new Position(newBoard, turn == 'x' ? 'o' : 'x');
  }

  public Integer[] possibleMoves() {
    List<Integer> list = new LinkedList<Integer>();
    for (int i = 0; i < board.length; i++) {
      if (board[i] == ' ') {
        list.add(i);
      }
    }
    Integer[] array = new Integer[list.size()];
    list.toArray(array);
    return array;
  }

  @Override
  public String toString() {
    return new String(board);
  }
}
