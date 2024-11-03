package newgenerictypes;

/*public record GenericTextBook<T>(T subject) implements IGenericBook<T> {
    @Override
    public T getTitleOrSubject() {
        return subject;
    }
}*/

public record GenericTextBook<T extends Comparable<T>>(T subject) implements IGenericBook<T> {
    @Override
    public T getTitleOrSubject() {
        return subject;
    }

    @Override
    public int compareTo(IGenericBook<T> other) {
        if (other instanceof GenericTextBook<T> otherTextBook) {
            return this.subject.compareTo(otherTextBook.subject);
        }
        return 0; 
    }
}