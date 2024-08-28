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
        TODO()
    }

    @Test
    fun testTurnRight() {
        TODO()
    }

    @Test
    fun testTurnLeft() {
        TODO()
    }

    @Test
    fun testMoveForwardWithObstacle() {
        TODO()
    }
}
