
class Shirt {
    double size;
    double slLen;

    String mtrl = "cotton";

    Shirt() {
    }

    Shirt(double sz, double len, String mtrl) {
        this.size = sz;
        this.slLen = len;
        this.mtrl = mtrl;
    }

    void pr() {
        pr("\nShirt : Size : " + size);
        pr("\nShirt : Sleeve Size : " + slLen);
        pr("\nShirt : Material : " + mtrl);
    }

    void prn()
    {
        pr("\n");
    }
    void pr(String msg) {
        System.out.print(msg);
    }
}

public class TestShirt {
    public static void main(String[] args) {
        Shirt s1 = new Shirt(40.5, 126.3, "Cotton");
        Shirt s2 = new Shirt(35.5, 120.3, "Polyster");
        Shirt s3 = new Shirt(45.5, 136.3, "TerryWool");
        s1.pr();
        pr();
        s2.pr();
        pr();
        s3.pr();
       // pr("Shirt created");
    }

    static void pr(String msg) {
        System.out.print(msg);
    }
    static void pr()
    {
        pr("\n");
    }
}
