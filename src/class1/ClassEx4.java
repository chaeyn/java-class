package class1;

public class ClassEx4 {
    static class ProductOrder {
        String productName;
        int price;
        int quantity;

        ProductOrder(String productName, int price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
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

        public void showData() {
            System.out.println("상품명: " + this.productName + ", 가격: " + this.price + ", 수량: " + this.quantity);
        }
    }

    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[]{
                new ProductOrder("두부", 2000, 2),
                new ProductOrder("김치", 5000, 1),
                new ProductOrder("콜라", 1500, 2),
        };

        int sum = 0;
        for (ProductOrder productOrder : productOrders) {
            productOrder.showData();
            sum += productOrder.getPrice() * productOrder.getQuantity();
        }
        System.out.println("최종 결제 금액: " + sum);
    }
}
