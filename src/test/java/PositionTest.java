import static org.junit.Assert.*;
import org.junit.*;


public class PositionTest {

  @Test
  public void testNew() throws Exception {
    Position position = new Position();
    assertEquals("         ", position.toString());
    assertEquals('x', position.turn);
  }

  @Test
  public void testMove() throws Exception {
    Position newPosition = new Position().move(1);
    assertEquals(" x       ", newPosition.toString());
    assertEquals('o', newPosition.turn);
  }

  @Test
  public void testPossibleMoves() throws Exception {
    Position newPosition = new Position().move(1).move(3).move(4);
    assertArrayEquals(new Integer[] {0, 2, 5, 6, 7, 8}, newPosition.possibleMoves());
  }

  @Test
  public void testWin() throws Exception {
    assertFalse(new Position().win('x'));
    assertTrue(new Position("xxx      ").win('x'));
    assertTrue(new Position("   ooo   ").win('o'));
    assertTrue(new Position("x  x  x  ").win('x'));
    assertTrue(new Position("x   x   x").win('x'));
    assertTrue(new Position("  x x x  ").win('x'));
  }

}
