package Hoja4;

public interface IList <N>{
	void push (N data);
	N pop();
	boolean empty ();
	public N peek();
	public int size();
}
