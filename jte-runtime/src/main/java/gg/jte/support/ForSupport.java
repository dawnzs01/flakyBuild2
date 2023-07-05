package gg.jte.support;

import java.util.Iterator;

public class ForSupport<T> implements Iterable<ForSupport<T>> {
    private final Iterator<T> iterator;

    private T item;
    private int index = -1;

    public static <T> ForSupport<T> of(Iterable<T> iterable) {
        return new ForSupport<>(iterable.iterator());
    }

    public static <T> ForSupport<T> of(T[] array) {
        return new ForSupport<>(new Iterator<>() {
            private int i;
            @Override
            public boolean hasNext() {
                return i < array.length;
            }

            @Override
            public T next() {
                return array[i++];
            }
        });
    }

    public ForSupport(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    public boolean isLast() {
        return !iterator.hasNext();
    }

    public boolean isFirst() {
        return index == 0;
    }

    public int getIndex() {
        return index;
    }

    public T get() {
        return item;
    }

    @Override
    public Iterator<ForSupport<T>> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public ForSupport<T> next() {
                item = iterator.next();
                ++index;
                return ForSupport.this;
            }
        };
    }
}
