package tryBuilder.ordersAndOrderHistory;

import tryBuilder.componentsOfOrders.Customer;
import tryBuilder.componentsOfOrders.OrderType;
import tryBuilder.componentsOfOrders.Payment;
import tryBuilder.componentsOfOrders.Shipping;

// It's another product class

public class OrderHistory {
    private final OrderType type;
    private final int products;
    private final Customer customer;
    private final Shipping shipping;
    private final Payment payment;

    public OrderHistory(OrderType type, int products, Customer customer, Shipping shipping, Payment payment) {
        this.type = type;
        this.products = products;
        this.customer = customer;
        this.shipping = shipping;
        this.payment = payment;
    }

    public String print() {
        String info = "";
        info += "Order type:"+ "\n"  + type + "\n";
        info += "Products in the order" + "\n" + payment.getVolume() + "\n";
        info += "Thank you, you are" + "\n" + customer + "\n";

        if (this.shipping != null) {
            info += "Wait for currier" + "\n";
        } else {
            info += "Your order without shipping" + "\n";
        }

        if (this.payment != null) {
            info += "You pay with cash" + "\n";
        } else {
            info += "You pay with credit card" + "\n";
        }
        return info;
    }
}
