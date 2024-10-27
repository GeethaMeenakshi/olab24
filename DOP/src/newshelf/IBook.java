package newshelf;

public sealed interface IBook permits Comic, Fiction, TextBook {
    
}

