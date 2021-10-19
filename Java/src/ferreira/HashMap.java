package ferreira;
import java.util.*;

import jdk.internal.org.jline.terminal.Size;

public class HashTable {
    static class Node<K, V> {
        K key;
        V value;
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    
    static public class HashMap<K, V> {
        private Node[] table;
        HashMap(int size) {
            this.table = new Node[size];
        }

        public void set(K key, V value) {
            Node<K, V> newNode = new Node<>();
            int hashedKey = hash(key);
            this.table[hashedKey] = newNode;
        }

        public V get(K key) {
            int hashedKey = hash(key);
            return this.table[hashedKey].value;
        }

        private int hash(K key) {
            //TO DO create a hash algorithm
            
        }


    }

    static public void main(String[] args) {
        System.out.println("test");
    }
}