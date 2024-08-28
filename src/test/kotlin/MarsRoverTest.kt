import org.example.*
import kotlin.test.Test
import kotlin.test.assertEquals

class MarsRoverTest {

    @Test
    fun testInitialPositionAndDirection() {
        val mapString = """
            --X--
            -----
            -----
            -----
            S----
        """.trimIndent()
        val map = makeMap(mapString)

        val startPosition = Position(0, 4)
        val startDirection = Direction.N
        val rover = MarsRover(startPosition, startDirection, map)

        assertEquals(Position(0, 4), rover.position)
        assertEquals(Direction.N, rover.direction)
    }

    @Test
    fun testMoveForwardNoObstacle() {
        val mapString = """
            --X--
            -----
            -----
            -----
            S----
        """.trimIndent()
        val map = makeMap(mapString)

        val rover = MarsRover(Position(0, 4), Direction.N, map)

        rover.executeCommands(arrayOf(Commands.FW))

        assertEquals(Position(0, 3), rover.position)
        assertEquals(Direction.N, rover.direction)
    }

    @Test
    fun testTurnRight() {
        val mapString = """
            --X--
            -----
            -----
            -----
            S----
        """.trimIndent()
        val map = makeMap(mapString)

        val rover = MarsRover(Position(0, 4), Direction.N, map)

        rover.executeCommands(arrayOf(Commands.R))

        assertEquals(Position(0, 4), rover.position)
        assertEquals(Direction.E, rover.direction)
    }

    @Test
    fun testTurnLeft() {
        val mapString = """
            --X--
            -----
            -----
            -----
            S----
        """.trimIndent()
        val map = makeMap(mapString)

        val rover = MarsRover(Position(0, 4), Direction.N, map)

        rover.executeCommands(arrayOf(Commands.L))

        assertEquals(Position(0, 4), rover.position)
        assertEquals(Direction.W, rover.direction)
    }

    @Test
    fun testMoveForwardWithObstacle() {
        val mapString = """
            --X--
            -----
            -----
            -----
            S----
        """.trimIndent()
        val map = makeMap(mapString)

        val startPosition = Position(2, 1)
        val startDirection = Direction.N
        val rover = MarsRover(startPosition, startDirection, map)

        rover.executeCommands(arrayOf(Commands.FW))
        rover.displayStatus()

        assertEquals(Position(2, 1), rover.position)
        assertEquals(Direction.N, rover.direction)
    }
}
