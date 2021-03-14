package tryBuilder.director;

import tryBuilder.componentsOfOrders.Customer;
import tryBuilder.componentsOfOrders.OrderType;
import tryBuilder.componentsOfOrders.Payment;
import tryBuilder.componentsOfOrders.Shipping;
import tryBuilder.builders.BuilderInterfaceYouNeedThoseMethodsForOrder;

public class Director {
    public void constractOrderMen(BuilderInterfaceYouNeedThoseMethodsForOrder orderBuilder) {
        orderBuilder.setOrderType(OrderType.GUEST);
        orderBuilder.setProductAmount(5);
        orderBuilder.setCustomer(Customer.MEN);
        orderBuilder.setShipping(new Shipping());
        orderBuilder.setPayment(new Payment(10.0, 0));
    }

    public void constractOrderWomen(BuilderInterfaceYouNeedThoseMethodsForOrder orderBuilder) {
        orderBuilder.setOrderType(OrderType.LOYAL);
        orderBuilder.setProductAmount(10);
        orderBuilder.setCustomer(Customer.WOMEN);
        orderBuilder.setShipping(new Shipping());
        orderBuilder.setPayment(new Payment(5.0, 10));
    }

    public void constractOrderChild(BuilderInterfaceYouNeedThoseMethodsForOrder orderBuilder) {
        orderBuilder.setOrderType(OrderType.ON_HOLD);
        orderBuilder.setProductAmount(20);
        orderBuilder.setCustomer(Customer.CHILD);
        orderBuilder.setShipping(new Shipping());
        orderBuilder.setPayment(new Payment(20.0, 0));
    }
}
