package tryBuilder.builders;

import tryBuilder.componentsOfOrders.Customer;
import tryBuilder.componentsOfOrders.OrderType;
import tryBuilder.componentsOfOrders.Payment;
import tryBuilder.componentsOfOrders.Shipping;

//interface provides only names of methods, all possible ways to configure a product

public interface BuilderInterfaceYouNeedThoseMethodsForOrder {
    void setOrderType(OrderType type);    //guest, loyal, on hold
    void setProductAmount(int products);  //5, 10, 20
    void setCustomer(Customer customer);  //men, women, child
    void setShipping(Shipping shipping);  //self, currier
    void setPayment(Payment payment);     //cash, credit card
}
