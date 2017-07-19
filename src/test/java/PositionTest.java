import static org.junit.Assert.*;
import org.junit.*;


public class PositionTest {

  @Test
  public void testNew() {
    Position position = new Position();
    assertEquals("         ", position.toString());
    assertEquals('x', position.turn);
  }

  @Test
  public void testMove() {
    Position newPosition = new Position().move(1);
    assertEquals(" x       ", newPosition.toString());
    assertEquals('o', newPosition.turn);
  }

  @Test
  public void testPossibleMoves() {
    Position newPosition = new Position().move(1).move(3).move(4);
    assertArrayEquals(new Integer[] {0, 2, 5, 6, 7, 8}, newPosition.possibleMoves());
  }

  @Test
  public void testWin() {
    assertFalse(new Position().win('x'));
    assertTrue(new Position("xxx      ").win('x'));
    assertTrue(new Position("   ooo   ").win('o'));
    assertTrue(new Position("x  x  x  ").win('x'));
    assertTrue(new Position("x   x   x").win('x'));
    assertTrue(new Position("  x x x  ").win('x'));
  }

  @Test
  public void testMinimax() {
    assertEquals(100, new Position("xxx      ").minimax());
    assertEquals(-100, new Position("ooo      ").minimax());
    assertEquals(0, new Position("xoxoxooxo").minimax());
    assertEquals(99, new Position(" xx      ", 'x').minimax());
    assertEquals(-99, new Position(" oo      ", 'o').minimax());

  }
}
