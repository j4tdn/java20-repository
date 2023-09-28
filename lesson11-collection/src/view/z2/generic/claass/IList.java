package view.z2.generic.claass;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface IList<E> {
	
	void add(E e);
	void add(int index, E e);
	
	E get(int index);
	void set(int index, E e);
	
	void remove(int index);
	void remove(E e);
	void removeIf(Predicate<E> predicate);
	
	boolean isEmpty();
	
	int size();
	int getCapacity();
	
	void forEach(Consumer<E> consumer);
	

}
