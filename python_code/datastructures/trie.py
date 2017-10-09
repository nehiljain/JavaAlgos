# http://www.geeksforgeeks.org/trie-insert-and-search/

class TrieNode(object):

  def __init__(self):
    self.children = [None] * 26 #assuming alphabets and is case insensitive
    self.is_end_of_word = False


class Trie:
  def __init__(self):
    self.root = self.get_node()

  @classmethod
  def _get_index_of_character(cls,ch):
    return ord(ch)-ord('a')

  def get_node(self):
    return TrieNode()

  def insert(self, key):

    key = key.lower().strip()
    key_length = len(key)
    cursor = self.root

    for level in xrange(key_length):

      index = Trie._get_index_of_character(key[level])
      if not cursor.children[index]:
        cursor.children[index] = self.get_node()
      cursor = cursor.children[index]

    cursor.is_end_of_word = True

  def search(self, key):
    key = key.lower().strip()
    key_length = len(key)
    cursor = self.root

    for level in xrange(key_length):

      index = Trie._get_index_of_character(key[level])
      if not cursor.children[index]:
        return False
      cursor = cursor.children[index]

    return cursor != None and cursor.is_end_of_word


def test():

    # Input keys (use only 'a' through 'z' and lower case)
    keys = ["the","a","there","anaswe","any",
            "by","their"]

    # Trie object
    t = Trie()

    # Construct trie
    for key in keys:
        t.insert(key)

    print("{} ---- {}".format("the",t.search("the")))
    print("{} ---- {}".format("thaw",t.search("thaw")))
    print("{} ---- {}".format("their",t.search("their")))

if __name__ == '__main__':
    test()
