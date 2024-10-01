// Direction.java
public interface Direction {
    Direction turnLeft();
    Direction turnRight();
    Position moveForward(Position currentPosition);
    String getDirection();
}
