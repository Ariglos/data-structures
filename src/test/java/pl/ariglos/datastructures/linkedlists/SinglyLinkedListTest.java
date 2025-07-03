package pl.ariglos.datastructures.linkedlists;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

  @Test
  void getFirst_givenEmptyList_shouldThrowException() {
    // Arrange
    var list = new SinglyLinkedList<Integer>();

    // Act
    // Assert
    assertThrows(NoSuchElementException.class, list::getFirst);
  }

  @Test
  void getFirst_givenNonEmptyList_shouldReturnFirstElement() {
    // Arrange
    var list = new SinglyLinkedList<Integer>();
    list.addFirst(31);

    // Act
    var firstElement = list.getFirst();

    // Assert
    assertEquals(31, firstElement);
  }

  @Test
  void getLast_givenEmptyList_shouldThrowException() {
    // Arrange
    var list = new SinglyLinkedList<Integer>();

    // Act
    // Assert
    assertThrows(NoSuchElementException.class, list::getLast);
  }

  @Test
  void getLast_givenSingleElementList_shouldReturnElement() {
    // Arrange
    var list = new SinglyLinkedList<Integer>();
    list.addFirst(12);

    // Act
    var lastElement = list.getLast();

    // Assert
    assertEquals(12, lastElement);
  }

  @Test
  void getLast_givenNonEmptyList_shouldReturnLastElement() {
    // Arrange
    var list = new SinglyLinkedList<Integer>();
    list.addFirst(7);
    list.addFirst(21);
    list.addFirst(14);
    list.addFirst(-53);

    // Act
    var lastElement = list.getLast();

    // Assert
    assertEquals(7, lastElement);
  }

  @Test
  void addFirst_givenEmptyList_shouldSetElementAsHead() {
    // Arrange
    var list = new SinglyLinkedList<Integer>();

    // Act
    list.addFirst(47);

    // Assert
    assertEquals(47, list.getFirst());
  }

  @Test
  void addFirst_givenNonEmptyList_shouldSetElementAsHead() {
    // Arrange
    var list = new SinglyLinkedList<Integer>();
    list.addFirst(44);

    // Act
    list.addFirst(52);

    // Assert
    assertEquals(52, list.getFirst());
  }

  @Test
  void addLast_givenEmptyList_shouldAddElementAsHead() {
    // Arrange
    var list = new SinglyLinkedList<Integer>();

    // Act
    list.addLast(89);

    // Assert
    assertEquals(89, list.getFirst());
  }

  @Test
  void addLast_givenNonEmptyList_shouldAddElementAtTheEnd() {
    // Arrange
    var list = new SinglyLinkedList<Integer>();
    list.addFirst(44);
    list.addFirst(-39);

    // Act
    list.addLast(0);

    // Assert
    assertEquals(0, list.getLast());
  }

  @Test
  void isEmpty_givenEmptyList_shouldReturnTrue() {
    // Arrange
    var list = new SinglyLinkedList<Integer>();

    // Act
    var isEmpty = list.isEmpty();

    // Assert
    assertTrue(isEmpty);
  }

  @Test
  void isEmpty_givenNonEmptyList_shouldReturnFalse() {
    // Arrange
    var list = new SinglyLinkedList<Integer>();
    list.addFirst(44);

    // Act
    var isEmpty = list.isEmpty();

    // Assert
    assertFalse(isEmpty);
  }

  @Test
  void toString_givenEmptyList_shouldPrintEmptyList() {
    // Arrange
    var list = new SinglyLinkedList<Integer>();

    // Act
    var stringList = list.toString();

    // Assert
    assertEquals("[]", stringList);
  }

  @Test
  void toString_givenNonEmptyList_shouldPrintList() {
    // Arrange
    var list = new SinglyLinkedList<Integer>();
    list.addFirst(-56);
    list.addFirst(34);
    list.addFirst(0);

    // Act
    var stringList = list.toString();

    // Assert
    assertEquals("[0, 34, -56]", stringList);
  }
}
