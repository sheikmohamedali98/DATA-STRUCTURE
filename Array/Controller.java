package Array;

public class Controller {
    public static void main(String[] args) {
        Array array = new Array(4);

        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.insert(60);
        array.update(0,100);
        array.remove(5);
        System.out.println(array.indexOf(500));
        System.out.println(array.contains(100));
        System.out.println(array.contains(10));
        array.printArray();
    }
}
