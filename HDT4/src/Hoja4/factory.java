package Hoja4;

public class factory {
	public static <N> IStack<N> makeStack(String stackType) {
        switch(stackType) {
            case "List":
                return new Stack<N>() {
                    @Override
                    public void push(N data) {
                        pushList(data);
                    }

                    @Override
                    public N pop() {
                        return popList();
                    }

                    @Override
                    public N peek() {
                        return peekList();
                    }

                    @Override
                    public int size() {
                        return sizeList();
                    }
                };
            case "ArrayList":
                return new Stack<N>() {
                    @Override
                    public void push(N data) {
                        push(data);
                    }

                    @Override
                    public N pop() {
                        return pop();
                    }

                    @Override
                    public N peek() {
                        return peek();
                    }

                    @Override
                    public int size() {
                        return size();
                    }
                };
            case "Vector":
                return new Stack<N>() {
                    @Override
                    public void push(N data) {
                        pushVector(data);
                    }

                    @Override
                    public N pop() {
                        return popVector();
                    }

                    @Override
                    public N peek() {
                        return peekVector();
                    }

                    @Override
                    public int size() {
                        return sizeVector();
                    }
                };
            default:
                throw new IllegalArgumentException("Tipo de stack no permitido: " + stackType);
        }
    }
}

