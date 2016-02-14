# inspired by prakhar github library


class Node(object):
    """ Node object to represent a node of the
    list.
    """

    def __init__(self, data=None, next=None):
        self.data = data
        self.next = next

    def __repr__(self):
        return str(self.data)


class SinglyLinkedList(object):
    """ Single Linked List using the node class defined above
        Methods in a linked list class
            insert()
            append()
            delete()
            is_empty()
            get_tail()
            get_head()

    """

    def __init__(self):
        self.head = None
        self.size = 0

    def __repr__(self):
        (current_node, nodes_list) = self.head, []
        while current_node:
            nodes_list.append(str(current_node))
            current_node = current_node.next
        return "->".join(nodes_list)

    def __len__(self):
        return self.size

    def insert(self, data):
        tmp_node = Node(data)
        tmp_node.next = self.head
        self.head = tmp_node
        self.size += 1

    def append(self, data):
        cur_node = self.head
        while cur_node.next:
            cur_node = cur_node.next
        new_node = Node(data)
        cur_node.next = new_node
        self.size += 1

    def is_empty(self):
        return self.size == 0

    def delete(self, data):
        prev_node = None
        current_node = self.head
        found = False
        while current_node and not found:
            if current_node.data == data:
                found = True
                break
            prev_node = current_node
            current_node = current_node.next

        if found:
            self.size -= 1
            if prev_node is None:
                self.head = self.head.next
            else:
                prev_node.next = current_node.next
        return self.head

    def get_head(self):
        return self.head

    def get_tail(self):
        cur_node = self.head
        while cur_node.next:
            cur_node = cur_node.next
        return cur_node

if __name__ == '__main__':
    l_list = SinglyLinkedList()
    l_list.insert(10)
    l_list.insert(3)
    l_list.append(4)
    l_list.append(5)
    print(l_list)
    l_list.delete(3)
    print(l_list)
    l_list.insert(3)
    l_list.insert(5)
    l_list.insert(3)
    print(l_list)



