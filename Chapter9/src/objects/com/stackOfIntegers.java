package objects.com;


class stackIntegers {
	int[] elements;
	int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	stackIntegers (){
		this(DEFAULT_CAPACITY);
	}
	stackIntegers (int capacity){
		elements = new int[capacity];
	}
	
	public void push(int value) {
		if(size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}
	public int pop() {
		return elements[--size];
	}
	public int peek() {
		return elements[size - 1];
	}
	public boolean empty() {
		return size == 0;
	}
	public int getSize() {
		return size;
	}
}
public class stackOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackIntegers stack = new stackIntegers();
		
		for(int i = 0;i<10;i++) {
			stack.push(i);
		}
		System.out.println("Top elements: " + stack.peek());
		
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}

		
	}

}
