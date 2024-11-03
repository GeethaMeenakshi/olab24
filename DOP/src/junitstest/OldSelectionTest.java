package junitstest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import oldshelf.Comic;
import oldshelf.Fiction;
import oldshelf.FictionType;
import oldshelf.OldSelection;
import oldshelf.TextBook;

public class OldSelectionTest {

    @Test
    public void testGetAgeOrTitleWithComic() {
        Comic comic = new Comic("Superhero", 25);
        String result = OldSelection.getAgeOrTitle(comic);
        assertEquals("Superhero", result, "Correct outcome obtained.");
    }

    @Test
    public void testGetAgeOrTitleWithFiction() {
        Fiction fiction = new Fiction("Minds", FictionType.Tragedy);
        String result = OldSelection.getAgeOrTitle(fiction);
        assertEquals("Minds", result, "Correct outcome obtained.");
    }

    @Test
    public void testGetAgeOrTitleWithTextBook() {
        TextBook textbook = new TextBook("Maths");
        String result = OldSelection.getAgeOrTitle(textbook);
        assertEquals("Maths", result, "Correct outcome obtained.");
    }

    @Test
    public void testGetAgeOrTitleWithInvalidObject() {
        String result = OldSelection.getAgeOrTitle("NotABook");
        assertEquals("", result, "Expected empty string for NotABook instance");
    }
}