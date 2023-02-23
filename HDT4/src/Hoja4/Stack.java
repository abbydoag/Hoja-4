package Hoja4;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

public class Stack <N>implements IStack<N>{	
	private ArrayList<N> stackNum = new ArrayList<N>();
    private List<N> list = new ArrayList<N>();
    private Vector<N> vector = new Vector<N>();
    //List
    public void pushList(N data) {
        list.add(data);
    }

    public N popList() {
        return list.remove(list.size()-1);
    }

    public N peekList() {
        return list.get(list.size()-1);
    }

    public int sizeList() {
        return list.size();
    }
    //ArrayList
	@Override
	public void push(N data) {
		stackNum.add(data);
	}
	@Override
	public N pop() {
		N erase = stackNum.get(stackNum.size()-1);
		stackNum.remove(erase);
		return erase;
	}
	@Override
	public N peek() {
		N peek = stackNum.get(stackNum.size()-1);
		return peek;
	}
	@Override
	public int size() {
		return stackNum.size();
	}
	//Vector
	public void pushVector(N data) {
        vector.add(data);
    }

    public N popVector() {
        return vector.remove(vector.size()-1);
    }

    public N peekVector() {
        return vector.get(vector.size()-1);
    }

    public int sizeVector() {
        return vector.size();
    }
    public boolean isEmpty() {
        return stackNum.size() == 0;
    }
}
