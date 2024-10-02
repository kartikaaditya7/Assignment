# Solutions to Coding Assingnment: EI Study

This repository provides solutions for two coding challenges involving the implementation of software design patterns and a Mars Rover simulation. Each challenge is contained in its respective folder, demonstrating practical applications of object-oriented programming principles in Java.

## Folder Structure

📦 ├── 📂 Exercise_1 │ ├── BehavioralPattern.java │ ├── CreationalPattern.java │ └── StructuralPattern.java │ └── 📂 ei_mars_rover ├── MarsRover.java └── RoverCommands.java


## Exercise_1

The **Exercise_1** folder contains implementations of various software design patterns, categorized as follows:
- **Behavioral Patterns**: Focus on object communication and responsibility sharing.
- **Creational Patterns**: Handle object creation mechanisms effectively.
- **Structural Patterns**: Showcase how classes and objects form complex structures.

Each pattern is implemented in an organized manner, adhering to best practices and coding standards.
### How to Run

1. **Clone the Repository**: Open your terminal and run the following command to clone the repository:
    ```bash
    git clone https://github.com/kartikaaditya7/Assignment.git
    ```


## ei_mars_rover
The `MarsRover` folder contains a comprehensive simulation for controlling a Mars Rover on a grid. The rover responds to commands for movement and rotation, ensuring it navigates efficiently without crossing boundaries or encountering obstacles.

### Key Components

- **Command Pattern**: Implemented using classes like `MoveForwardCommand`, `TurnLeftCommand`, and `TurnRightCommand` to encapsulate rover actions.
- **Grid & Position Handling**: `Grid` defines boundaries, while `Position` maintains the rover's current location.
- **Direction Classes**: `North`, `South`, `East`, and `West` classes handle the rover’s orientation and direction-specific behavior.
- **Simulation Logic**: `MarsRoverSimulation.java` acts as the main entry point to run and test the rover's behavior.

### How to Run
1. Compile all Java files in the `MarsRover` folder.
2. Execute `MarsRoverSimulation.java` to start the simulation.

## Technologies Used

- **Java**: All solutions are implemented in Java, focusing on object-oriented principles and design patterns.

