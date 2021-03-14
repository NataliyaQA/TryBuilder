package tryBuilder.builders;

import tryBuilder.componentsOfOrders.Customer;
import tryBuilder.componentsOfOrders.OrderType;
import tryBuilder.componentsOfOrders.Payment;
import tryBuilder.componentsOfOrders.Shipping;
import tryBuilder.ordersAndOrderHistory.OrderHistory;

public class OrderHistoryBuilder implements BuilderInterfaceYouNeedThoseMethodsForOrder {
    private OrderType type;    //guest, loyal, on hold
    private int products;  //5, 10, 20
    private Customer customer;  //men, women, child
    private Shipping shipping;  //self, currier
    private Payment payment;     //cash, credit card


    @Override
    public void setOrderType(OrderType type) {
        this.type = type;
    }

    @Override
    public void setProductAmount(int products) {
        this.products = products;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    @Override
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public OrderHistory getResult(){
        return new OrderHistory(type, products, customer, shipping, payment);
    }
}
