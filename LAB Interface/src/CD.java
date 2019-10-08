public class CD implements Priceable {
    int price = 500;
    private String Name ;
    private int Year;
    private int ThisYear = 2019;
    private double Discount = 1;
    public CD(String NameRec,int YearRec)
    {
        Name = NameRec;
        if(YearRec <= ThisYear)
        {
            for(int i = YearRec ; i < ThisYear ; i++)
                Discount = Discount -0.1;
        }
        price = (int)(price*Discount);
        if(price <= 100)
            price = 100;
    }
    public int getPrice() {
        return price;
    }
}

