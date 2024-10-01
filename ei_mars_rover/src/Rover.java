// Rover.java
public class Rover {
    private Position position;
    private Direction direction;
    private Grid grid;

    public Rover(Position position, Direction direction, Grid grid) {
        this.position = position;
        this.direction = direction;
        this.grid = grid;
    }

    public void moveForward() {
        Position newPosition = direction.moveForward(position);
        if (grid.isWithinBounds(newPosition) && !grid.hasObstacle(newPosition)) {
            this.position = newPosition;
        } else {
            System.out.println("Cannot move: Obstacle detected or boundary reached.");
        }
    }

    public void turnLeft() {
        this.direction = direction.turnLeft();
    }

    public void turnRight() {
        this.direction = direction.turnRight();
    }

    public void reportStatus() {
        System.out.println("Rover is at " + position + " facing " + direction.getDirection());
    }
}
