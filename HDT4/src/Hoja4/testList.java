package Hoja4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testList {

	@Test
	public void popAndPushTest() {
        linkedList<Integer> list = new linkedList<Integer>();
        list.push(1);
        list.push(2);
        assertEquals(2, list.pop().intValue());
        assertEquals(1, list.pop().intValue());
    }
	
	@Test
	public void peekTest() {
		linkedList<Integer> list = new linkedList<>();
		list.push(0);
		assertEquals(0, list.peek());
	}
}
