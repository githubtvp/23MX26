public class Account {

    private String id;
    private String name;
    private int balance;
    Account()
    {

    }

    Account(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    Account(String id, String name, int balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    String getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }

    int getBalance()
    {
        return balance;
    }

    int credit(int amt)
    {
        balance+=amt;
        return balance;
    }

    int debit(int amt)
    {
        if(amt <= balance)
        {
            balance-=amt;
        }
        else {
            System.out.print("\nAmount exceeded the balance held currently.\n");
        }
        return balance;
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
