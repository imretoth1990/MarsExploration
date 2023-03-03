package mapgeneratortest;

import mapgeneratortest.IO.GetInputNumber;
import mapgeneratortest.IO.InputScanner;
import mapgeneratortest.logic.map.LandMap;

import mapgeneratortest.logic.MapEditor;
import mapgeneratortest.logic.random.RandomNumberGenerator;
import mapgeneratortest.IO.MapPrinter;

public class Application {
    public static void main(String[] args) {
        String path = "src/main/resources/generated/generated-map.map";
        MapPrinter mapPrinter = new MapPrinter(path);
        InputScanner getInput = new GetInputNumber();
        int width = getInput.scanUserInt("Please, enter width: ");
        int length = getInput.scanUserInt("Please, enter length: ");
        LandMap map = new LandMap(width, length);
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        MapEditor mapEditor = new MapEditor(mapPrinter, map, randomNumberGenerator);
        mapEditor.runApp();
    }
}
