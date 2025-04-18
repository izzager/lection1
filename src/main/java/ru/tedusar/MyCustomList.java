package ru.tedusar;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

// Здесь показано, что мы можем сам делать свои реализации коллекций,
// имплементируя (то есть описывая реализацию) интерфейса Collection.
// Интерфейс = контракт, который описывает, какие методы должны быть реализованы в классе.
// Реализация же методов находится в классе (MyCustomList), который реализует интерфейс (Collection).
public class MyCustomList implements Collection<String> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        Collection.super.forEach(action);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return Collection.super.toArray(generator);
    }

    @Override
    public boolean add(String s) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super String> filter) {
        return Collection.super.removeIf(filter);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Spliterator<String> spliterator() {
        return Collection.super.spliterator();
    }

    @Override
    public Stream<String> stream() {
        return Collection.super.stream();
    }

    @Override
    public Stream<String> parallelStream() {
        return Collection.super.parallelStream();
    }
}
