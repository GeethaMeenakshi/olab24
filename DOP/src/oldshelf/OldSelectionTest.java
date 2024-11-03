package oldshelf;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OldSelectionTest {

    @Test
    public void testGetAgeOrTitleWithComic() {
        Comic comic = new Comic("Superhero", 25);
        String result = OldSelection.getAgeOrTitle(comic);
        assertEquals("Superhero", result, "The title of the comic should be returned.");
    }

    @Test
    public void testGetAgeOrTitleWithFiction() {
        Fiction fiction = new Fiction("Mystery", FictionType.Tragedy);
        String result = OldSelection.getAgeOrTitle(fiction);
        assertEquals("Mystery", result, "The name of the fiction should be returned.");
    }

    @Test
    public void testGetAgeOrTitleWithTextBook() {
        TextBook textbook = new TextBook("Maths");
        String result = OldSelection.getAgeOrTitle(textbook);
        assertEquals("Maths", result, "The subject of the textbook should be returned.");
    }

    @Test
    public void testGetAgeOrTitleWithInvalidObject() {
        String result = OldSelection.getAgeOrTitle("NotABook");
        assertEquals("", result, "The result should be an empty string for an invalid object.");
    }
}