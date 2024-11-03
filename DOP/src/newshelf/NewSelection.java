package newshelf;

public class NewSelection {

    /*public static String getAgeOrTitle(Object o) {
        if (o instanceof Comic comic) {
            return comic.title();
        } else if (o instanceof Fiction fiction) {
            return fiction.title();
        } else if (o instanceof TextBook textbook) {
            return textbook.subject();
        }
        return "";
    }*/

    
    
    /*public static String getAgeOrTitle(Object o) {
        return switch (o) {
            case Comic comic when comic.title() != null && !comic.title().isEmpty() -> 
                comic.title();
            case Fiction fiction when fiction.title() != null && !fiction.title().isEmpty() -> 
                fiction.title();
            case TextBook textBook when textBook.subject() != null && !textBook.subject().isEmpty() -> 
                textBook.subject();
            default -> ""; 
        };
    }*/

    public static String getAgeOrTitle(Object o) {
        return switch (o) {
            case Comic(String title, int ageOfMainCharacter) when title != null && !title.isEmpty() -> title;
            case Fiction(String title, FictionType type) when title != null && !title.isEmpty() -> title;
            case TextBook(String subject) when subject != null && !subject.isEmpty() -> subject;
            default -> "";  
        };
    }


    public static void main(String[] args) {
        Comic comic = new Comic("Angel", 25);
        Fiction fiction = new Fiction("Mystery", FictionType.Tragedy);
        TextBook textbook = new TextBook("Maths");

        System.out.println(getAgeOrTitle(comic));    
        System.out.println(getAgeOrTitle(fiction));  
        System.out.println(getAgeOrTitle(textbook)); 
    }
}