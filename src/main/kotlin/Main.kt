package org.example

enum class Commands {
    FW,R,L
}

// Enum to represent the direction the Rover is facing
enum class Direction {
    N, S, E, W
}

// Data class to represent the position of the Rover
data class Position(var x: Int, var y: Int)

// Class to represent the Mars Rover
// map should be rectangle
class MarsRover(
    var position: Position,
    var direction: Direction,
    private val map: Array<CharArray>
) {

    // Method to execute a list of commands
    fun executeCommands(commands: Array<Commands>) {
        commands.forEach { command ->
            when (command) {
                Commands.FW -> moveForward()
                Commands.R -> turnRight()
                Commands.L -> turnLeft()
            }
        }
    }

    // Method to move the Rover forward
    private fun moveForward() {
        TODO()
    }

    // Method to turn the Rover right (90° clockwise)
    private fun turnRight() {
        TODO()
    }

    // Method to turn the Rover left (90° counterclockwise)
    private fun turnLeft() {
        TODO()
    }

    // Check if the position is safe (not an obstacle and within bounds)
    private fun isSafePosition(x: Int, y: Int): Boolean {
        TODO()
    }

    // Method to display the Rover's current status
    fun displayStatus() {
        println("Rover is at (${position.x}, ${position.y}) facing $direction")
    }
}

// Main function to run the Mars Rover simulation
fun main() {
    // Map defined using a Kotlin string template
    val mapString = """
        --X--
        -----
        -----
        -----
        S----
    """.trimIndent()

    // Convert the string template into a 2D array of characters
    val map = makeMap(mapString)

    // Starting position (x = 0, y = 4), assuming the S symbol is the rover's initial position and direction
    val startPosition = Position(0, 4)
    val startDirection = Direction.N
    val rover = MarsRover(startPosition, startDirection, map)

    // Example commands to move and turn the rover
    val commands = arrayOf(Commands.FW, Commands.R, Commands.FW, Commands.FW, Commands.L, Commands.FW)

    // Execute the commands and display the final status of the rover
    rover.executeCommands(commands)
    rover.displayStatus() // Should print the final position and direction of the rover
}

fun makeMap(mapString: String) : Array<CharArray> {
    return mapString.lines().map { it.toCharArray() }.toTypedArray()
}