import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnit4.class)
public class FormatterTest {

    private final boolean expected = true;

    @Test
    public void testFormatInput() {

        String inputOne = "with its powerful tools and dazzling effects,Keynote makes it Easy to create stunning and memorable presentations. ";
        String inputTwo = "See Who you ’re working with ... While you’re editing, a separate list lets you quickly see who else is in the presentation.";
        String patternOne = "With its powerful tools and dazzling effects, keynote makes it easy to create stunning and memorable presentations.";
        String patternTwo = "See who you’re working with... While you’re editing, a separate list lets you quickly see who else is in the presentation.";

        boolean actualOne = Formatter.formatInput(inputOne).equals(patternOne);
        boolean actualTwo = Formatter.formatInput(inputTwo).equals(patternTwo);

        assertEquals(expected, actualOne);
        assertEquals(expected, actualTwo);
    }
}
