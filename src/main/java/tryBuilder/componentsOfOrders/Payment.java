package tryBuilder.componentsOfOrders;

public class Payment {
    private final double volume;
    private double creditCard;
    private boolean paid;

    public Payment(double volume, double creditCard) {
        this.volume = volume;
        this.creditCard = creditCard;
    }

    public void paid() {
        paid = true;
    }

    public void notPaid() {
        paid = false;
    }

    public boolean isPaid() {
        return paid;
    }

    public void amount(double creditCard) {
        if (paid) {
            this.creditCard += creditCard;
        } else {
            System.err.println("Try pay with cash");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getCreditCard() {
        return creditCard;
    }
 }
