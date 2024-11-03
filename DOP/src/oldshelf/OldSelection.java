
package oldshelf;

public class OldSelection {

	public static String getAgeOrTitle(Object o) {
        if (o instanceof Comic) {
            return ((Comic) o).getTitle();
        } else if (o instanceof Fiction) {
            return ((Fiction) o).getName();
        } else if (o instanceof TextBook) {
            return ((TextBook) o).getSubject();
        }
        return "";
    }

    /*public static String getAgeOrTitle(Object o) {
        return switch (o) {
            case Comic comic -> comic.getTitle();  
            case Fiction fiction -> fiction.getName();  
            case TextBook textBook -> textBook.getSubject();  
            default -> ""; 
        };
    }*/

	public static void main(String[] args) {
		
		Comic comic = new Comic("Superhero", 25);
        Fiction fiction = new Fiction("Mystery", FictionType.Tragedy);
        TextBook textbook = new TextBook("Maths");

        System.out.println(getAgeOrTitle(comic));     
        System.out.println(getAgeOrTitle(fiction));   
        System.out.println(getAgeOrTitle(textbook));  
		
	}
}