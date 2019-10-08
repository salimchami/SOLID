package io.shodo.formations.solid.sr;

import java.util.List;

/**
 * Created by mrk on 4/7/14.
 */
public class Board {
    private final BoardDrawer boardDrawer;
    private final List<List<String>> spots;
    private int boardSize;

    public List<List<String>> getSpots() {
        return spots;
    }

    public Board(int boardSize) {
        this.boardSize = boardSize;
        this.boardDrawer = new BoardDrawer(boardSize);
        this.spots = boardDrawer.draw();
    }

    public List<String> firstRow() {
        return spots.get(0);
    }

    public List<String> secondRow() {
        return spots.get(1);
    }

    public List<String> thirdRow() {
        return spots.get(2);
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void display() {
        List<String> firstRow = this.spots.get(0);
        String formattedFirstRow = firstRow.get(0) + " | " + firstRow.get(1) + " | " + firstRow.get(2) + "\n" + firstRow.get(3) + " | " + this.spots.get(4) + " | " + this.spots.get(5) + "\n" + this.spots.get(6) + " | " + this.spots.get(7) + " | " + this.spots.get(8);
        System.out.print(formattedFirstRow);
    }

}
