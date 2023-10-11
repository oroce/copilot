import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.Assert.assertEquals;

public class RockPaperScissorTest {

    @Test
    public void testUserWins() {
        String input = "2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        RockPaperScissor.main(new String[]{});
        assertEquals("Gratulálunk, Ön nyert!\n", outContent.toString());
    }

    @Test
    public void testComputerWins() {
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        RockPaperScissor.main(new String[]{});
        assertEquals("Sajnáljuk, Ön vesztett!\n", outContent.toString());
    }

    @Test
    public void testDraw() {
        String input = "3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        RockPaperScissor.main(new String[]{});
        assertEquals("Döntetlen!\n", outContent.toString());
    }
}