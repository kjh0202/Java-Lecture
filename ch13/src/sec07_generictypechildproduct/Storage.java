package sec07_generictypechildproduct;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}
