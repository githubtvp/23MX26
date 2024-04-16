import java.util.ArrayList;

class Paladin extends AbstractJob {
    private double modifier = 1.6;
    @Override
    double getJobModifier()
    {
        return modifier;
    }

    public Paladin(String name)
    {
        super.name = name;
    }
}

abstract class AbstractJob {
    protected String name;
    protected ArrayList<T> inventory = new ArrayList<T>();
    private int armor;
    private int attack;

    abstract double getJobModifier(); // unique to sub classes

    public double getArmor() {       // make other calculations based on inventory items        return armor * getJobModifier();    }

        AbstractJob(String name)
        {
            this.name = name;
        }
    }
}
    public static void main(String[] args)
    {
        Paladin cecil = new Paladin("Cecil");
    }
    System.out.println(cecil.getArmor());
}
