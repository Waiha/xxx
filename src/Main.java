public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.insert(23);
		list.show();
		list.deleteAt(23);
		list.reverse();
		list.show();

	}
}