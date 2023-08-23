package utensilien;


public record Triple<T, U, V>(T t1, U t2, V t3) implements Multi3<T, U, V> {}

