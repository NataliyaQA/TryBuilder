package tryBuilder.ordersAndOrderHistory;

import tryBuilder.componentsOfOrders.Customer;
import tryBuilder.componentsOfOrders.OrderType;
import tryBuilder.componentsOfOrders.Payment;
import tryBuilder.componentsOfOrders.Shipping;

public class Order {
    private final OrderType type;
    private final int products;
    private final Customer customer;
    private final Shipping shipping;
    private final Payment payment;

    public Order(OrderType type, int products, Customer customer, Shipping shipping, Payment payment) {
        this.type = type;
        this.products = products;
        this.customer = customer;
        this.shipping = shipping;
        if (this.shipping != null) {
            this.shipping.setOrder(this);
        }
        this.payment = payment;
    }

    public OrderType getType() {
        return type;
    }

    public int getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public Payment getPayment() {
        return payment;
    }
}


