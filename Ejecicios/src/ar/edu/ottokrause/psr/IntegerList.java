package ar.edu.ottokrause.psr;

public interface IntegerList {

    /**
     * Appends the specified element to the end of this list.
     */
    boolean add(Integer element);

    /**
     * Inserts the specified element at the specified position in this list
     * (optional operation).
     */
    void add(int index, Integer element);

    /**
     * Appends all of the elements in the specified collection to the end of
     * this list, in the order that they are returned by the specified
     * collection's iterator.
     */
    boolean addAll(IntegerList aList);

    /**
     * Inserts all of the elements in the specified collection into this list at
     * the specified position.
     */
    boolean addAll(int index, IntegerList aList);

    /**
     * Removes all of the elements from this list.
     */
    void clear();

    /**
     * Returns true if this list contains the specified element.
     */
    boolean contains(Integer element);

    /**
     * Returns the element at the specified position in this list.
     */
    Integer get(int index);

    /**
     * Returns the index of the first occurrence of the specified element in
     * this list, or -1 if this list does not contain the element.
     */
    int indexOf(Integer element);

    /**
     * Returns true if this list contains no elements.
     */
    boolean isEmpty();

    /**
     * Returns the index of the last occurrence of the specified element in this
     * list, or -1 if this list does not contain the element.
     */
    int lastIndexOf(Integer element);

    /**
     * Removes the element at the specified position in this list.
     */
    int remove(int index);

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     */
    void set(int index, Integer element);

    /**
     * Returns the number of elements in this list.
     */
    int size();

    /**
     * Returns a view of the portion of this list between the specified
     * fromIndex, inclusive, and toIndex, exclusive.
     */
    IntegerList subList(int fromIndex, int toIndex);

    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence (from first to last element).
     */
    int[] toArray();
}