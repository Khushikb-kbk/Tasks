package com.xworkz.wednesday.internal;

public class AIChessBoard
{
    private String material;
    private boolean autoMovePieces;
    private int difficultyLevels;

    public AIChessBoard(String material, boolean autoMovePieces, int difficultyLevels) {
        this.material = material;
        this.autoMovePieces = autoMovePieces;
        this.difficultyLevels = difficultyLevels;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Auto-Move Pieces: " + autoMovePieces + ", Difficulty Levels: " + difficultyLevels;
    }
}


