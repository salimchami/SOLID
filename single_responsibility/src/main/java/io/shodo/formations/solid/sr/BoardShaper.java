package io.shodo.formations.solid.sr;

import java.util.ArrayList;
import java.util.List;

public class BoardShaper {
    int size;

    public BoardShaper(int size) {
        this.size = size;
    }


    public List<ArrayList<Integer>> rowIndexes() {
        ArrayList<ArrayList<Integer>> rowIndexes = new ArrayList<>();

        for (int i = 0; i < this.size; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < this.size; j++) {
                row.add((i*size)+(j));
            }
            rowIndexes.add(row);
        }

        return rowIndexes;
    }
}
