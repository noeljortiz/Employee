public class Commission extends Hourly{

    private double totalSales;
    public double cRate;
    private double s;
    private double hourW;



    public Commission (String eName, String eAddress, String ePhone,
                   String socSecNumber, double cRate){
        super (eName, eAddress, ePhone, socSecNumber, cRate);
        this.cRate = cRate;
    }
    public double pay(double cPayment)
    {
       double commish = s * cRate;
         cPayment = super.pay() + hourW + commish ;

        return cPayment;
    }
    public double addSales(double addSales){
        s = addSales;
        return s;
    }
    public double hWage(double hWage,int hWorkd){
        hourW = hWage*hWorkd;
        addHours(hWorkd);
        return hourW;

    }














}
