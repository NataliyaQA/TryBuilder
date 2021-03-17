package tryBuilder;

import tryBuilder.builders.OrderBuilder;
import tryBuilder.builders.OrderHistoryBuilder;
import tryBuilder.director.Director;
import tryBuilder.ordersAndOrderHistory.Order;
import tryBuilder.ordersAndOrderHistory.OrderHistory;

public class FinallyTryIt {
    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client (application code).
        // That's because application knows better which builder to use to get a specific product.
        OrderBuilder builder = new OrderBuilder();
        director.constractOrderChild(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Order order = builder.getResult();
        System.out.println("Order built:\n" + order.getType() + "\n" + order.getProducts()+ "\n" + order.getCustomer()
                + "\n" + order.getShipping());


        OrderHistoryBuilder orderHistoryBuilder = new OrderHistoryBuilder();

        // Director may know several building recipes
        director.constractOrderWomen(orderHistoryBuilder);
        OrderHistory orderHistory = orderHistoryBuilder.getResult();
        System.out.println("\nOrder history built:\n" + orderHistory.print());

    }
}
