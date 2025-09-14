package linkedlist

/**
 * Each node in a linked list is a structure.
 * The *head* node is the first node in the list.
 */
data class Node<T>(
    var value: T,
    var next: Node<T>? = null
)
