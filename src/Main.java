public class Main {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test3() {
        System.out.println("test3");
        LinkedList list = new LinkedList();
        System.out.println(list.toString());
        list.reverse();
        System.out.println(list.toString());
    }

    private static void test2() {
        System.out.println("test2");

        LinkedList list = new LinkedList();
        list.insert(18);
        System.out.println(list.toString());
        list.reverse();
        System.out.println(list.toString());
    }

    private static void test1() {
        System.out.println("test1");

        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(45);
        list.insert(12);
        list.insert(23);

        System.out.println(list.toString());
        list.reverse();
        System.out.println(list.toString());
    }
}

