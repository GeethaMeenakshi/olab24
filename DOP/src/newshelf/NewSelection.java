package newshelf;

public class NewSelection {

    public static String getAgeOrTitle(Object o) {
        if (o instanceof Comic comic) {
            return comic.title();
        } else if (o instanceof Fiction fiction) {
            return fiction.title();
        } else if (o instanceof TextBook textbook) {
            return textbook.subject();
        }
        return "";
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
