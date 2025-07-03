package pl.ariglos.datastructures.linkedlists;

import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E> {

  private static class Node<E> {
    E data;
    Node<E> next;

    Node(E data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node<E> head;

  public SinglyLinkedList() {
    this.head = null;
  }

  @Override
  public E get(int index) {
    return null;
  }

  @Override
  public E getFirst() {
    if (head == null) {
      throw new NoSuchElementException("List is empty");
    }
    return head.data;
  }

  @Override
  public E getLast() {
    if (head == null) {
      throw new NoSuchElementException("List is empty");
    }
    var lastNode = getLastNode();
    return lastNode.data;
  }

  @Override
  public void add(int index, E data) {}

  @Override
  public void addFirst(E data) {
    var newNode = new Node<>(data);
    if (head == null) {
      head = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
  }

  @Override
  public void addLast(E data) {
    var newNode = new Node<>(data);
    if (head == null) {
      head = newNode;
    } else {
      var lastNode = getLastNode();
      lastNode.next = newNode;
    }
  }

  @Override
  public void remove(int index) {}

  @Override
  public E removeFirst() {
    return null;
  }

  @Override
  public E removeLast() {
    return null;
  }

  @Override
  public boolean contains(E data) {
    return false;
  }

  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return head == null;
  }

  @Override
  public void printList() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    var node = head;
    var joiner = new StringJoiner(", ", "[", "]");
    while (node != null) {
      joiner.add(String.valueOf(node.data));
      node = node.next;
    }
    return joiner.toString();
  }

  private Node<E> getLastNode() {
    var node = head;
    while (node.next != null) {
      node = node.next;
    }
    return node;
  }
}
