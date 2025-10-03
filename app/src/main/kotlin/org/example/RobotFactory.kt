package org.example

class RobotFactory {

    companion object {

        private fun generateRandomRobot(): Robot {
            val directions = Direction.entries
            val direction = directions.random()
            val x = (-100..100).random()
            val y = (-100..100).random()
            return Robot(direction, x, y)
        }

        private fun generateRandomCommand(): String {
            val commands = listOf("L", "R", "A")
            return commands.random()
        }

        fun randomizedRobot(): List<Robot> {
            val robots = mutableListOf<Robot>()
            val numberOfRobots = 25

            repeat(numberOfRobots) {
                val robot = generateRandomRobot()
                robot.handleCommand(generateRandomCommand())
                robots.add(robot)
            }

            return robots


        }
    }

}