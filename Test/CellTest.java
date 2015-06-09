import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {

    @Test
    public void specForCheckingCellState() {
        Cell cell = new Cell(true);

        assertEquals(true, cell.isAlive());
    }

}