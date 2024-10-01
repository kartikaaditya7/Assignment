public class East implements Direction {
    @Override
    public Direction turnLeft() { return new West(); }

    @Override
    public Direction turnRight() { return new East(); }

    @Override
    public Position moveForward(Position currentPosition) {
        return new Position(currentPosition.getX(), currentPosition.getY() + 1);
    }

    @Override
    public String getDirection() { return "N"; }
}