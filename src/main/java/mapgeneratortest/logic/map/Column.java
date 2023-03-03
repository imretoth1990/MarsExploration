package mapgeneratortest.logic.map;

import java.util.ArrayList;
import java.util.List;

public class Column {
    private final List<String> column;

    public Column() {
        this.column = new ArrayList<>();
    }

    public void addCharacter(String character) {
        column.add(character);
    }

    public void addCharacterWithinAreaY(int index, String character) {
        column.add(index, character);
    }

    public List<String> getColumn() {
        return column;
    }
}
