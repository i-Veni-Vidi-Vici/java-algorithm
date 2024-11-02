package dfs.populating_next_right_pointers_in_each_node_116;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        bfs(queue);
        return root;
    }
    public void bfs(Queue<Node> queue){
        Queue<Node> temp=new LinkedList<>();
        while(!queue.isEmpty()){
            Node curr=queue.poll();
            if(curr==null){
                continue;
            }
            if(curr.left!=null){
                temp.add(curr.left);
            }
            if(curr.right!=null){
                temp.add(curr.right);
            }
            curr.next=queue.peek();
        }
        if(!temp.isEmpty()){
            bfs(temp);
        }
    }
    // 1ms
}
