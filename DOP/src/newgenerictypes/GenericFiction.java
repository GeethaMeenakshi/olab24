package newgenerictypes;

/*public record GenericFiction<T>(T title, FictionType type) implements IGenericBook<T> {
    @Override
    public T getTitleOrSubject() {
        return title;
    }
}*/
public record GenericFiction<T extends Comparable<T>>(T title, FictionType type) implements IGenericBook<T> {
    @Override
    public T getTitleOrSubject() {
        return title;
    }

    @Override
    public int compareTo(IGenericBook<T> other) {
        if (other instanceof GenericFiction<T> otherFiction) {
            return this.title.compareTo(otherFiction.title);
        }
        return 0; 
    }
}
