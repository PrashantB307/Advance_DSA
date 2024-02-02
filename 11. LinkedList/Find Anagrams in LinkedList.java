

//    https://www.geeksforgeeks.org/problems/find-anagrams-in-linked-list--170647/1


import java.util.*;
class Node {
    char data;
    Node next;

    Node(char x) {
        data = x;
        next = null;
    }
}

class Solution {
    public static ArrayList<Node> findAnagrams(Node head, String s) {
        ArrayList<Node> ans = new ArrayList<>();
        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr1[ch - 'a']++;
        }

        int n = s.length();
        int count = 0;
        Node ptr = head;
        Node curr = head;

        while (ptr != null) {
            count++;
            char c = ptr.data;
            arr2[c - 'a']++;

            if (count == n) {
                if (isAnagram(arr1, arr2)) {
                    Node next = ptr.next; 
                    ptr.next = null; 
                    ans.add(curr); 
                    ptr = next; 
                    curr = ptr; 
                    count = 0;
                    Arrays.fill(arr2, 0);
                } else {
                    char ch1 = curr.data;
                    arr2[ch1 - 'a']--;
                    ptr = ptr.next;
                    curr = curr.next;
                    count--;
                }
            } else {
                ptr = ptr.next;
            }
        }

        return ans;
    }

    public static boolean isAnagram(int arr1[], int arr2[]) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}