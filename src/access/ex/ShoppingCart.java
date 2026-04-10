package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 참");
        } else {
            items[this.itemCount] = item;
            itemCount += 1;
        }
    }


    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int sum = 0;
        for (Item item : items) {
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
            sum += item.getTotalPrice();
        }
        System.out.println("전제 가격 합: " + sum);
    }
}