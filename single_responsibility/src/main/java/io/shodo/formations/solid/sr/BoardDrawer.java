package io.shodo.formations.solid.sr;

import java.util.ArrayList;
import java.util.List;

public class BoardDrawer {

    private final Integer boardSize;

    public BoardDrawer(Integer boardSize) {
        this.boardSize = boardSize;
    }

    public List<List<String>> draw() {
        final List<List<String>> board = new ArrayList<>();
        for (int i = 0; i < boardSize; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < boardSize; j++) {
                row.add(String.valueOf(j + i*boardSize));
            }
            board.add(row);
        }
        return board;
    }
}