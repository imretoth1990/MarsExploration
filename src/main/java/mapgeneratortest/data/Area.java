package mapgeneratortest.data;

public class Area {

    int startingPointX;
    int startingPointY;
    int xTo;
    int yTo;

    public Area(int startingPointX, int xTo, int startingPointY, int yTo) {
        this.startingPointX = startingPointX;
        this.startingPointY = startingPointY;
        this.xTo = xTo;
        this.yTo = yTo;
    }

    public int getStartingPointX() {
        return startingPointX;
    }

    public int getStartingPointY() {
        return startingPointY;
    }

    public int getXTo() {
        return xTo;
    }

    public int getYTo() {
        return yTo;
    }
}
