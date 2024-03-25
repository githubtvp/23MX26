public class Invoice {

    private String id;
    private String desc;
    private int qty;
    double unitPrice;

    Invoice()
    {

    }

    Invoice(String id, String desc, int qty, double unitPrice)
    {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    String getId()
    {
        return id;
    }
    String getDesc()
    {
        return desc;
    }

    int getQty()
    {
        return qty;
    }

    double getUnitPrice()
    {
        return unitPrice;
    }

    void setQty(int q)
    {
        qty = q;
    }

    void setUnitPrice(double up)
    {
       unitPrice = up;
    }

    double getTotal()
    {
        return (qty * unitPrice);
    }
    @Override
    public String toString()
    {
        return ("Invoice Item : Id : " + id + ", Description : "
                + getDesc() + ", Quantity : " + getQty() + ", Unit Price : " + getUnitPrice());
    }
    public static void main(String[] args) {
        // Test constructor and toString()
        Invoice inv1 = new Invoice("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);  // toString();

        // Test Setters and Getters
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1);  // toString();
        System.out.println("id is: " + inv1.getId());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQty());
        System.out.println("unitPrice is: " + inv1.getUnitPrice());

        // Test getTotal()
        System.out.println("The total is: " + inv1.getTotal());
    }
}
