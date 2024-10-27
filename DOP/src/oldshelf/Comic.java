package oldshelf;

public class Comic extends Book {

	private String title;

	private final int ageOfMainCharacter;

	public Comic(String title,int ageOfMainCharacter) {
        super(title); 
        this.ageOfMainCharacter = ageOfMainCharacter;
	}
	
    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

	public int getAgeOfMainCharacter() {
        return ageOfMainCharacter;
    }

	@Override
	public String toString() {
		return  "Title = "+title+" ageofMainCharacter = "+ageOfMainCharacter;
	}

	@Override
    public int hashCode() {
       return title.hashCode() + Integer.hashCode(ageOfMainCharacter);
    }

	
	@Override
    public boolean equals(Object o) {
      if (this == o) 
        return true;
      if (!(o instanceof Comic)) 
        return false;
      Comic comic = (Comic) o;
      return ageOfMainCharacter == comic.ageOfMainCharacter && title.equals(comic.title);
    }

}