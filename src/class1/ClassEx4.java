package class1;

public class ClassEx4 {
    public static void main(String[] args) {

        ProductOrder p1 = new ProductOrder("두부", 2000, 2);
        ProductOrder p2 = new ProductOrder("김치", 5000, 1);
        ProductOrder p3 = new ProductOrder("콜라", 1500, 2);

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();

        int total = 0;
        total += p1.getPrice() * p1.getQuantity();
        total += p2.getPrice() * p2.getQuantity();
        total += p3.getPrice() * p3.getQuantity();

        System.out.println("총 결제 금액: " + total);
    }
}

class ProductOrder {
    String product;
    int price;
    int quantity;

    // 생성자
    public ProductOrder(String product, int price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    // 출력 메서드
    public void printInfo() {
        System.out.println("상품명: " + product + ", 가격: " + price + ", 수량: " + quantity);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}