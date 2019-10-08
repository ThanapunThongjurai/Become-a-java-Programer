public class Cart implements Priceable {
    //private final static int MAX_PRODUCT = 30;
    int product = 0;
    Priceable[] items ;

    public Cart(int Receive)
    {
        product = Receive;
        items = new Priceable[product];
    }


    public int sumPrice() {
        int sum = 0;

        for (int i = 0; i < product; i++) {
            if (items[i] != null) {
                sum += items[i].getPrice();
            }
        }

        return sum;
    }

    private double Discount = 0;

    public void setter(int ReceiveDiscount)
    {
        if(ReceiveDiscount <= 70)
            Discount = (100-ReceiveDiscount)*0.01;

    }

    public double sumPriceWithDiscount() {
        return (double) (sumPrice()*Discount);
    }

    public int getPrice() {
        return sumPrice();
    }
}

