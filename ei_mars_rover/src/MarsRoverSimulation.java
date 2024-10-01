// MarsRoverSimulation.java
import java.util.List;

public class MarsRoverSimulation {
    public static void main(String[] args) {
        // Initialize grid with obstacles
        Grid grid = new Grid(10, 10);
        grid.addObstacle(new Position(2, 2));
        grid.addObstacle(new Position(3, 5));

        // Initialize rover at starting position (0, 0, N)
        Rover rover = new Rover(new Position(0, 0), new North(), grid);

        // Define command sequence
        List<Command> commands = List.of(
                new MoveForwardCommand(),
                new MoveForwardCommand(),
                new TurnRightCommand(),
                new MoveForwardCommand(),
                new TurnLeftCommand(),
                new MoveForwardCommand()
        );

        // Execute commands
        for (Command command : commands) {
            command.execute(rover);
        }

        // Report final status
        rover.reportStatus();
    }
}
