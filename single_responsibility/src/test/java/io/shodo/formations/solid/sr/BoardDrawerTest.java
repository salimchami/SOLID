package io.shodo.formations.solid.sr;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class BoardDrawerTest {

    @Test
    void draw() {
        BoardDrawer boardDrawer = new BoardDrawer(3);

        List<List<String>> draw = boardDrawer.draw();
        List<String> row1 = Arrays.asList("0", "1", "2");
        List<String> row2 = Arrays.asList("3", "4", "5");
        List<String> row3 = Arrays.asList("6", "7", "8");
        //System.out.println(draw);
        Assert.assertArrayEquals(row1.toArray(), draw.get(0).toArray());
        Assert.assertArrayEquals(row2.toArray(), draw.get(1).toArray());
        Assert.assertArrayEquals(row3.toArray(), draw.get(2).toArray());
        Assert.assertEquals(3, boardDrawer.draw().size());
    }

    @Test
    void drawOneCase() {
        BoardDrawer boardDrawer = new BoardDrawer(1);
        List<List<String>> board = boardDrawer.draw();
        List<String> row1 = Arrays.asList("0");
        System.out.println(board);
        Assert.assertArrayEquals(row1.toArray(), board.get(0).toArray());
        Assert.assertEquals(1, boardDrawer.draw().size());
    }

    @Test
    void drawTwoCase() {
        BoardDrawer boardDrawer = new BoardDrawer(2);
        List<List<String>> board = boardDrawer.draw();
        List<String> row1 = Arrays.asList("0", "1");
        List<String> row2 = Arrays.asList("2", "3");
        System.out.println(board);
        Assert.assertArrayEquals(row1.toArray(), board.get(0).toArray());
        Assert.assertArrayEquals(row2.toArray(), board.get(1).toArray());

        Assert.assertEquals(2, boardDrawer.draw().size());
    }
}