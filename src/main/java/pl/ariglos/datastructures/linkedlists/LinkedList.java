package pl.ariglos.datastructures.linkedlists;

public interface LinkedList<E> {
  E get(int index);

  E getFirst();

  E getLast();

  void add(int index, E data);

  void addFirst(E data);

  void addLast(E data);

  void remove(int index);

  E removeFirst();

  E removeLast();

  boolean contains(E data);

  int size();

  boolean isEmpty();

  void printList();
}
