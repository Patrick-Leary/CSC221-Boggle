import java.util.List;

public interface IWordOnBoardFinder {

    /**
     * Return a list of cells on the given board such that
     * the i-th element of the list correponds to the
     * i-th character of the string as found on the board.
     * Returns an empty list if the word cannot be found on the board.
     * 
     * @param board is searched for the given word
     * @param word  is being searched for on the board
     * @return list of cells on the supplied board that
     *         correspond to the word, an empty list should be returned if the word
     *         cannot be
     *         found on the board
     */

    public List<BoardCell> cellsForWord(BoggleBoard board, String word){

    List<BoardCell> list = new ArrayList<BoardCell>();for(
    int r = 0;r<board.size();r++)
    {
        for (int c = 0; c < board.size(); c++) {
            if (helper(board, r, c, word)) {
                list.add(word);
                return list;
            }
        }
    }return list;}

private boolean helper(BoggleBoard board, int r, int c, String word) {
    if (word == "") {
        return true;
    }

    if (board.getFace(r, c) == word.charAt(0) + "") {
        if (r + 1 <= board.size()) {
            helper(board, r + 1, c, word.substring(1, word.length()));
        }

        if (r - 1 >= 0) {
            helper(board, r - 1, c, word.substring(1, word.length()));
        }

        if (c + 1 <= board.size()) {
            helper(board, r, c + 1, word.substring(1, word.length()));
        }

        if (c - 1 >= 0) {
            helper(board, r, c - 1, word.substring(1, word.length()));
        }

        if ((r + 1 <= board.size()) && (c + 1 <= board.size()) {
            helper(board, r + 1, c + 1, word.substring(1, word.length()));
        }

        if ((r - 1 >= 0) && (c + 1 <= board.size())) {
            helper(board, r - 1, c + 1, word.substring(1, word.length()));
        }

        if ((r - 1 >= 0) && (c - 1 >= 0)) {
            helper(board, r - 1, c - 1, word.substring(1, word.length()));
        }

        if ((r + 1 <= board.size()) && (c - 1 >= 0)) {
            helper(board, r + 1, c - 1, word.substring(1, word.length()));
        }
    }

    return false;
}
}
