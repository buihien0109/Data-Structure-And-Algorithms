public class MyLinkedList {
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static Node addToHead(Node head, int val) {
        Node newNode = new Node(val);
        if (head != null) {
            newNode.next = head;
        }
        return newNode;
    }

    public static Node addToTail(Node head, int val) {
        Node newNode = new Node(val);
        if (head != null) {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            lastNode.next = newNode;
        }
        return newNode;
    }

    public static Node addToIndex(Node head, int val, int index) {
        if (index == 0) {
            return addToHead(head, val); // Neu index = 0. Tuc la them vao dau LinkedList
        } else {
            Node current = head;
            Node newNode = new Node(val);
            int count = 0;
            while (current != null) {
                count++;
                if (count == index) {
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
        }
        return null;
    }

    public static Node removeAtHead(Node head) {
        if (head != null) {
            return head.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;

//        printLinkedList(node1);
//        printLinkedList(node2);
//        printLinkedList(node3);
//
//        Node node0 = addToHead(node1, 0);
//        printLinkedList(node0);
//
//        Node node4 = addToTail(node1, 4);
//        printLinkedList(node0);

//        printLinkedList(node1);
//        addToIndex(node1, 4, 2);
//        printLinkedList(node1);

        printLinkedList(node1);
        node1 = removeAtHead(node1);
        printLinkedList(node1);
        node1 = removeAtHead(node1);
        printLinkedList(node1);
        node1 = removeAtHead(node1);
        printLinkedList(node1);

    }
}
