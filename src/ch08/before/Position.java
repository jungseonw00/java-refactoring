package ch08.before;

public class Position {
    public int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void relativeMove(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
