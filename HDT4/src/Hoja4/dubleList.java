package Hoja4;

public class dubleList <N> implements IList<N> {
	 private Node<N> head;
	    private Node<N> tail;
	    private int size;
	    public dubleList() {
	        head=null;
	        tail=null;
	        size=0;
	    }
	    @Override
	    public void push(N data) {
	        Node<N> nuevoNodo=new Node<>(data);
	        if (head==null) {
	            head=nuevoNodo;
	            tail=nuevoNodo;
	        } else {
	        	nuevoNodo.setNext(head);
	            head.setPrev(nuevoNodo);
	            head=nuevoNodo;
	        }
	        size++;
	    }
	    @Override
	    public N pop() {
	        if (tail==null) {
	            return null;
	        }
	        Node<N> popNodo=tail;
	        tail=tail.getPrev();
	        if (tail==null) {
	            head=null;
	        } else {
	            tail.setNext(null);
	        }
	        popNodo.setPrev(null);
	        size--;
	        return popNodo.getData();
	    }
	    @Override
	    public boolean empty() {
	        return tail==null;
	    }
	    @Override
	    public N peek() {
	        if (tail==null) {
	            return null;
	        }
	        return tail.getData();
	    }
	    @Override
	    public int size() {
	        return size;
	    }
	    private static class Node<N> {
	        private N data;
	        private Node<N> prev;
	        private Node<N> next;

	        public Node(N data) {
	            this.data=data;
	            this.prev=null;
	            this.next=null;
	        }
	        public N getData() {
	            return data;
	        }

	        public Node<N> getPrev() {
	            return prev;
	        }
	        public void setPrev(Node<N> prev) {
	            this.prev=prev;
	        }
	        public Node<N> getNext() {
	            return next;
	        }
	        public void setNext(Node<N> next) {
	            this.next=next;
	        }
	    }
}
