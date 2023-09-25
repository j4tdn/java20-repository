package view.z2.generic.claass;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface IList<E> {
	
	void add(E e);
	void add(int index, E e);
	
	E get(int i);
	void set(int i, E e);
	
	void remove(int i);
	void remove(E e);
	void removeIf(Predicate<E> predicate);
	
	boolean isEmpty();
	
	int size();
	int capacity();
	
	void forEach(Consumer<E> consumer);
	
}
