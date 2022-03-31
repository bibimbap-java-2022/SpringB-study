package bibimbap.test;

import bibimbap.test.domain.Item;
import bibimbap.test.domain.ItemStore;

public class Main {
    public static void main(String[] args) {
        String str = "박지원";
        System.out.println(str);

        System.out.println("itemStore 생성");
        ItemStore store = new ItemStore();
        store.printItemList();
        System.out.println();

        System.out.println("addItem");
        store.addItem(new Item("Coffee", 1500, 10));
        store.addItem(new Item("IceCream", 500, 5));
        store.addItem(new Item("Snack", 1000, 20));
        store.printItemList();
        System.out.println();

        System.out.println("sellItem");
        store.sellItem(0, 5);
        store.printItemList();
        System.out.println();

        System.out.println("fillItem");
        store.fillItem(2, 10);
        store.printItemList();
        System.out.println();
    }
}
