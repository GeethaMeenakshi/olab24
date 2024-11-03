package newgenerictypes;

public class GenericSelection {

    /*public static <T> T getTitleOrSubject(IGenericBook<T> book) {
        return switch (book) {
            case GenericComic<T>(T title, int ageOfMainCharacter) when title != null -> title;
            case GenericFiction<T>(T title, FictionType type) when title != null -> title;
            case GenericTextBook<T> textBook when textBook.getTitleOrSubject() != null -> textBook.getTitleOrSubject();
            default -> null;
        };
    }*/

    public static <T extends Comparable<T>> T getTitleOrSubject(IGenericBook<T> book) {
        return switch (book) {
            case GenericComic<T>(T title, int ageOfMainCharacter) when title != null -> title;
            case GenericFiction<T>(T title, FictionType type) when title != null -> title;
            case GenericTextBook<T> textBook when textBook.getTitleOrSubject() != null -> textBook.getTitleOrSubject();
            default -> null; 
        };
    }

    public static void main(String[] args) {
        GenericComic<String> comic = new GenericComic<>("Angel", 25);
        GenericFiction<String> fiction = new GenericFiction<>("Spiders", FictionType.Tragedy);
        GenericTextBook<String> textbook = new GenericTextBook<>("Math Textbook");

        System.out.println(getTitleOrSubject(comic));      
        System.out.println(getTitleOrSubject(fiction));    
        System.out.println(getTitleOrSubject(textbook));    
    }
}
