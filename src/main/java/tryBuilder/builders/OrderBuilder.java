package tryBuilder.builders;

import tryBuilder.componentsOfOrders.Customer;
import tryBuilder.componentsOfOrders.OrderType;
import tryBuilder.componentsOfOrders.Payment;
import tryBuilder.componentsOfOrders.Shipping;
import tryBuilder.ordersAndOrderHistory.Order;

//Builder can construct unrelated products, which don't have the common interface. In this case I build an order
//Builder implements steps defined in the common interface


public class OrderBuilder implements BuilderInterfaceYouNeedThoseMethodsForOrder {
    private OrderType type;     //GUEST,LOYAL,ON_HOLD
    private int products;       //5, 10, 20
    private Customer customer;  //men, women, child
    private Shipping shipping;  //self, currier
    private Payment payment;    //cash, credit card

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

    public Order getResult(){
        return new Order(type, products, customer, shipping, payment);
    }
}
