package Hoja4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testStack {

	@Test
	public void testArray() {
        IStack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        assertEquals(3, stack.size());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
        assertEquals(Integer.valueOf(0), stack.pop());
        assertEquals(0, stack.size());
    }
	public void testList() {
        IStack<Integer> stack = new Stack<Integer>();
        stack.pushList(2);
        stack.pushList(1);
        assertEquals(2, stack.sizeList());
        assertEquals(2, stack.popList());
        assertEquals(1, stack.popList());
        assertEquals(0, stack.sizeList());
    }
	public void testVector() {
        IStack<Double> stack = new Stack<Double>();
        stack.pushVector(3.21);
        stack.pushVector(2.18);
        assertEquals(2, stack.sizeVector());
        assertEquals(Double.valueOf(2.18), stack.popVector());
        assertEquals(Double.valueOf(3.21), stack.popVector());
        assertEquals(0, stack.sizeVector());
    }
}
