package day17;

public enum ChessPiece {
    KING_WHITE("\u2654", 100), KING_BLACK("\u265A", 100),
    QUEEN_WHITE("\u2655", 9), QUEEN_BLACK("\u265B", 9),
    ROOK_WHITE("\u2656", 5), ROOK_BLACK("\u265C", 5),
    BISHOP_WHITE("\u2657",3.5), BISHOP_BLACK("\u265D", 3.5),
    KNIGHT_WHITE("\u2658", 3), KNIGHT_BLACK("\u265E",3),
    PAWN_WHITE("\u2659", 1), PAWN_BLACK("\u265F",1),
    EMPTY("_", -1);

    private final String picture;
    private final double value;

    ChessPiece(String picture, double value) {
        this.picture = picture;
        this.value = value;
    }

    public String getPicture() {
        return picture;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return picture;
    }
}
