public class ClassroomTrie {
    static class Node {
        Node[] children = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) { // O(n)
        int level = 0;
        int len = word.length();
        int idx = 0;

        Node curr = root;
        for (; level < len; level++) {
            idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) { // O(n)
        int level = 0;
        int len = key.length();
        int idx = 0;

        Node curr = root;

        for (; level < len; level++) {
            idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    // Unique Substring -> count Nodes
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count + 1;
    }

    // Longest Word with all prefixes
    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) { // for lexicographical larger just reverse the loop like: {i=25;i>=0;i--} and
                                       // you'll get the answer
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1); // backtrack
            }
        }
    }

    public static void main(String[] args) {
        /*
         * String words[] = { "apple", "app", "mango", "man", "woman" };
         * 
         * String prefix1 = "app";
         * String prefix2 = "moon";
         * 
         * for (int i = 0; i < words.length; i++) {
         * insert(words[i]);
         * }
         * 
         * System.out.println(startsWith(prefix1));
         * System.out.println(startsWith(prefix2));
         * 
         * // Unique Substring
         * String str = "ababa"; // ans=10
         * 
         * // suffix -> insert in trie
         * for (int i = 0; i < str.length(); i++) {
         * String suffix = str.substring(i);
         * insert(suffix);
         * }
         * 
         * System.out.println("No. of Unique Substrings =" + countNodes(root));
         */

        // Longest Word with all prefixes
        String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
