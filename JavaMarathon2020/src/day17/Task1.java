package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;

        Object[] myChess = new Enum[]{pawnWhite, pawnWhite, pawnWhite, pawnWhite,
                rookBlack, rookBlack,rookBlack,rookBlack};
        for (Object chess : myChess) {
            System.out.print(chess.toString());
        }
    }
}
