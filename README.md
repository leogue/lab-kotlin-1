# Kotlin Lab 1 - Robot Simulation

This is a practical lab assignment completed as part of my engineering school curriculum, serving as an introduction to Kotlin programming.

## Overview

This project implements a simple robot simulation system where robots can move on a 2D grid and respond to basic commands.

## Features

- **Robot Class**: Represents a robot with position (x, y) and direction (NORTH, EAST, SOUTH, WEST)
- **Movement Commands**:
  - `L` - Turn left
  - `R` - Turn right
  - `A` - Advance forward
- **RobotFactory**: Generates 25 robots with random positions and executes random commands
- **Functional Programming**: Demonstrates Kotlin's collection operations (filter, map, groupBy, sortedBy)

## Running the Project

```bash
./gradlew run
```

## Running Tests

```bash
./gradlew test
```
