package mapgeneratortest.logic;

import mapgeneratortest.data.Area;
import mapgeneratortest.logic.map.Column;
import mapgeneratortest.logic.map.LandMap;
import mapgeneratortest.logic.random.RandomNumberGenerator;
import mapgeneratortest.IO.MapPrinter;

import java.util.List;

public class MapEditor {
    MapPrinter mapPrinter;
    LandMap map;
    RandomNumberGenerator randomNumberGenerator;

    public MapEditor(MapPrinter mapPrinter, LandMap map, RandomNumberGenerator randomNumberGenerator) {
        this.mapPrinter = mapPrinter;
        this.map = map;
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void runApp() {
        map.createEmptyCanvas();
        editMap();
        mapPrinter.printMap(map);
    }
    public void editMap() {
        // Area data
        Area area1 = new Area(0, 10, 19, 28);
        Area area2 = new Area(13, 28, 2, 12);
        Area area3 = new Area(3, 16, 6, 13);
        Area area4 = new Area(17, 23, 14, 22);
        String mountain = "^";
        String pit = "#";
        String apple = "";
        String water = "~";
        fillMapWithinArea(area1, mountain);
        fillMapWithinArea(area2, pit);
        fillMapWithinArea(area3, apple);
        fillMapWithinArea(area4, water);
    }

    public void fillMapWithinArea(Area area, String symbol) {
        for(int i = area.getStartingPointX(); i <= area.getXTo(); i++) {
            List<String> column = createRandomColumnWithinArea(area.getStartingPointY(), area.getYTo(), symbol);
            replaceRandomRowWithinArea(area.getStartingPointX(), area.getXTo(), column);
        }
    }

    public void replaceRandomRowWithinArea(int startingPointX, int xTo, List<String> column) {
        map.replaceColumn(randomNumberGenerator.getAreaXAndY(startingPointX, xTo), column);
    }

    public List<String> createRandomColumnWithinArea(int startingPointY, int yTo,  String symbol) {
        Column column = new Column();
        for (int i = 0; i < map.getWidth(); i++) {
            column.addCharacter("");
        }
        for (int i = 0; i < 3; i++) {
          int index = randomNumberGenerator.getAreaXAndY(startingPointY, yTo);
          column.getColumn().set(index, symbol);
        }
        return column.getColumn();
    }


}
