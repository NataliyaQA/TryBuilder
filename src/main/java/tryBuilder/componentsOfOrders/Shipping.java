package tryBuilder.componentsOfOrders;

import tryBuilder.ordersAndOrderHistory.Order;

public class Shipping {

    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public void showShippingMethod() {
        System.out.println("Shipping method:" + order.getShipping());
    }

    public void showPayment() {
        if (this.order.getPayment().isPaid()) {
            System.out.println("Order is paid with credit card");
        } else {
            System.out.println("Order is paid with cash");
        }
    }
}
