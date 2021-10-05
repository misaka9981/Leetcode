// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {

    private Iterator<Integer> iterator;
    private Integer cache = null; // 缓存第一次peek时的元素

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        iterator = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (cache == null)
            cache = iterator.next();
        return cache;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (cache == null)
            return iterator.next();
        Integer temp = cache;
        cache = null;
        return temp;
    }

    @Override
    public boolean hasNext() {
        return cache != null || iterator.hasNext();
    }
}