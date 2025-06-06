

import java.io.*;

import java.util.stream.*;

class SinglyLinkedListNode {
  public int data;
  public SinglyLinkedListNode next;

  public SinglyLinkedListNode(int nodeData) {
    this.data = nodeData;
    this.next = null;
  }
}

class SinglyLinkedList {
  public SinglyLinkedListNode head;
  public SinglyLinkedListNode tail;

  public SinglyLinkedList() {
    this.head = null;
    this.tail = null;
  }

  public void insertNode(int nodeData) {
    SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

    if (this.head == null) {
      this.head = node;
    } else {
      this.tail.next = node;
    }

    this.tail = node;
  }
}

class SinglyLinkedListPrintHelper {
  public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
      throws IOException {
    while (node != null) {
      bufferedWriter.write(String.valueOf(node.data));

      node = node.next;

      if (node != null) {
        bufferedWriter.write(sep);
      }
    }
  }
}

class Solution {

  /*
   * Complete the 'deleteNode' function below.
   *
   * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
   * The function accepts following parameters:
   * 1. INTEGER_SINGLY_LINKED_LIST llist
   * 2. INTEGER position
   */

  /*
   * For your reference:
   *
   * SinglyLinkedListNode {
   * int data;
   * SinglyLinkedListNode next;
   * }
   *
   */

  public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    // Write your code here

    SinglyLinkedListNode S, T;

    if (position == 0) {
      T = llist;
      llist = llist.next;
      T.next = null;

      return llist;
    } else {
      S = llist;
      for (int i = 1; i <= position - 1; i++) {
        S = S.next;
      }
      T = S.next;
      S.next = T.next;
      T.next = null;

      return llist;
    }

  }

}

public class Result {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    SinglyLinkedList llist = new SinglyLinkedList();

    int llistCount = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, llistCount).forEach(i -> {
      try {
        int llistItem = Integer.parseInt(bufferedReader.readLine().trim());

        llist.insertNode(llistItem);
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    int position = Integer.parseInt(bufferedReader.readLine().trim());

    SinglyLinkedListNode llist1 = Solution.deleteNode(llist.head, position);

    SinglyLinkedListPrintHelper.printList(llist1, " ", bufferedWriter);
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
