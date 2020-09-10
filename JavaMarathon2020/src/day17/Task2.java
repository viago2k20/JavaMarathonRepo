package day17;

public class Task2 {
    public static void main(String[] args) {

        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece pawnBlack = ChessPiece.PAWN_BLACK;
        ChessPiece knightBlack = ChessPiece.KNIGHT_BLACK;
        ChessPiece knightWhite = ChessPiece.KING_WHITE;
        ChessPiece bishopWhite = ChessPiece.BISHOP_WHITE;
        ChessPiece bishopBlack = ChessPiece.BISHOP_BLACK;
        ChessPiece rookWhite = ChessPiece.ROOK_WHITE;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;
        ChessPiece queenWhite = ChessPiece.QUEEN_WHITE;
        ChessPiece queenBlack = ChessPiece.QUEEN_BLACK;
        ChessPiece kingWhite = ChessPiece.KING_WHITE;
        ChessPiece kingBlack = ChessPiece.KING_BLACK;
        ChessPiece empty = ChessPiece.EMPTY;

        Enum[][] solution = {
                {rookBlack, empty, empty, empty, empty, rookBlack, kingBlack, empty},
                {empty, rookWhite, empty, empty, pawnBlack, pawnBlack, empty, pawnBlack},
                {pawnBlack, empty, knightBlack, empty, empty, empty, pawnBlack, empty},
                {queenBlack, empty, empty, bishopWhite, empty, empty, empty, empty},
                {empty,empty,empty,bishopBlack,pawnWhite,empty,empty,empty},
                {empty,empty,empty,empty,bishopWhite,pawnWhite,empty,empty},
                {pawnWhite,empty,empty,queenWhite,empty,pawnWhite,empty,pawnWhite},
                {empty,empty,empty,empty,empty,rookWhite,kingWhite,empty}
        };

        ChessBoard chessBoard = new ChessBoard(solution);
        chessBoard.print();
    }
}
