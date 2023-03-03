package mapgeneratortest.IO;

import mapgeneratortest.logic.map.LandMap;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MapPrinter {
    private final String path;

    public MapPrinter(String path) {
        this.path = path;
    }

    public void printMap(LandMap map) {
        StringBuilder stringMap = new StringBuilder();

        for (List<String> line : map.getLandMap()) {
            stringMap.append("\n");
            for (String token : line) {
                if(token.isBlank()) {
                    stringMap.append(" ");
                } else {
                    stringMap.append(token);
                }
            }
        }
        write(stringMap.toString());
    }

    public void write(String map) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(map);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

