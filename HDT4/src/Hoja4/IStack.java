package Hoja4;

public interface IStack <N>{
	public void push (N data);
	public N pop();
	public N peek();
	public int size();
	public void pushVector(N data);
	public void pushList(N data);
	public int sizeList();
	public N popList();
	public int sizeVector();
	public N popVector();
	
}
