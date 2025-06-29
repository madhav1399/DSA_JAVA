package Tries;

class Node{
    Node[] links  = new Node[26];
    boolean flag = false;

    public Node(){

    }

    boolean containsKey(char ch){
        return links[ch-'a']!= null;
    }

    void put(char ch, Node node){
        links[ch-'a'] = node;
    }

    Node get(char ch){
        return links[ch-'a'];
    }

    void setEnd(){
        flag = true;
    }

    boolean isEnd(){
        return flag;
    }
}

public class Trie {

    private static Node root;

    Trie(){
        root = new Node();
    }

    // TC - O(len(word))
    void insert(String word){
        Node node = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!node.containsKey(ch)){
                node.put(ch, new Node());
            }
            node = node.get(ch);
        }
        node.setEnd();
    }

    // O(len(word))
    boolean search(String word){
        Node node = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!node.containsKey(ch)) return false;

            node = node.get(ch);
        }

        return node.isEnd();
    }

    // O(len(prefix))
    boolean startsWith(String prefix){
        Node node = root;
        for(int i=0;i<prefix.length();i++){
            char ch = prefix.charAt(i);
            if(!node.containsKey(ch)) return false;

            node = node.get(ch);
        }
        return true;
    }
}
