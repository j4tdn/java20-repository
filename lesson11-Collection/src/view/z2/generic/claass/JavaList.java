package view.z2.generic.claass;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaList<E> implements IList<E> {
	
	private E[] es;
	private int size;
	private int defaultCapacity = 10;
	
	public JavaList() {
		es = createArray(defaultCapacity);
	}
	
	public JavaList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("Capacity at least = 0");
		}
		es = createArray(capacity);
	}

	@Override
	public void add(E e) {
		if (size == es.length) {
			es = grow();
		}
		es[size++] = e;
	}

	@Override
	public void add(int index, E e) {
	}

	@Override
	public E get(int i) {
		return es[i];
	}

	@Override
	public void set(int i, E e) {
		es[i] = e;
	}

	@Override
	public void remove(int pos) {
		for (int i = pos; i < size; i++) {
			es[i] = es[i+1];
		}
		size--;
	}
	
	// size = 4
	
	// a, b, b, d, null, null
	// a, b, d, null, null, null
	// a, c, d, null, null, null
	
	// remove(b)
	
	@Override
	public void remove(E e) {
		
	}

	@Override
	public void removeIf(Predicate<E> predicate) {
		for (int i = 0; i < size; i++) {
			if (predicate.test(es[i])) {
				remove(i--);
			}
		}
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public int capacity() {
		return es.length;
	}

	@Override
	public void forEach(Consumer<E> consumer) {
		for(E e: es) {
			consumer.accept(e);
		}
	}
	
	// -----------------------------------
	
	// es = {a, b, c, d, e}
	// newEs = {a, b, c, d, e, null, null}
	
	private E[] grow() {
		int newLength = size * 3/2;
		E[] newEs = createArray(newLength);
		for (int i = 0; i < es.length; i++) {
			newEs[i] = es[i];
		}
		return newEs;
	}
	
	@SuppressWarnings("unchecked")
	private E[] createArray(int length) {
		return (E[])Array.newInstance(Object.class, length);
	}
}
