package Hoja4;

public class linkedList <N>implements IList<N>{
	 private Node<N> head;
	    private int size;
	    public linkedList() {
	        head=null;
	        size=0;
	    }
	    @Override
	    public void push(N data) {
	        Node<N> nuevoNodo=new Node<>(data);
	        nuevoNodo.setNext(head);
	        head=nuevoNodo ;
	        size++;
	    }
	    @Override
	    public N pop() {
	        if (head==null) {
	            return null;
	        }
	        Node<N> popNodo=head;
	        head=head.getNext();
	        popNodo.setNext(null);
	        size--;
	        return popNodo.getData();
	    }
	    @Override
	    public boolean empty() {
	        return head==null;
	    }
	    @Override
	    public N peek() {
	        if (head==null) {
	            return null;
	        }
	        return head.getData();
	    }
	    @Override
	    public int size() {
	        return size;
	    }
	    private static class Node<N> {
	        private N data;
	        private Node<N> next;
	        public Node(N data) {
	            this.data=data;
	            this.next=null;
	        }
	        public N getData() {
	            return data;
	        }
	        public Node<N> getNext() {
	            return next;
	        }
	        public void setNext(Node<N> next) {
	            this.next=next;
	        }
	    }
	}
