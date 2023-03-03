package mapgeneratortest.logic.map;

import mapgeneratortest.logic.map.Column;

import java.util.ArrayList;
import java.util.List;

public class LandMap {
    private final List<List<String>> map;
    int width;
    int length;

    public LandMap(int width, int length) {
        this.width = width;
        this.length = length;
        this.map = new ArrayList<>();
    }
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void createEmptyCanvas() {
        Column column = new Column();
        for (int i = 0; i < length; i++) {
            column.addCharacter("");
        }

        for (int i = 0; i < length; i++) {
            map.add(column.getColumn());
        }
    }

    public List<List<String>> getLandMap() {
        return map;
    }

    public void replaceColumn(int index, List<String> column) {
        map.set(index, column);
    }

    private void addColumnToRow(Column column, String row) {
        System.out.println("");
    }
}
