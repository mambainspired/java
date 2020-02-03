package com.kalsden;

public class LinkedList {
    Node head;

    public LinkedList insert(LinkedList list, Student s) {
        Node new_node = new Node(s);
        new_node.next = null;

        // If list is empty then make new_node the head
        if (list.head == null) {
            list.head = new_node;
        }
        else
        {
            // Traverse til the last node and insert the new student there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public void printList (LinkedList list) {
        Node current_node = list.head;
        if (current_node.student != null) {
            System.out.println(current_node.student.getFirstName());
            while (current_node.next != null) {
                current_node = current_node.next;
                System.out.println(current_node.student.getFirstName());
            }
        } else {
            System.out.println("Empty list");
        }
    }

}
