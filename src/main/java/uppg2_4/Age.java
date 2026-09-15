package uppg2_4;

public class Age {

    private int years;

    public Age(int years) {
        if (years < 0)
            throw new IllegalArgumentException("years cannot be negative");
        else if (years > 150)
            throw new IllegalArgumentException("years cannot be greater than 150");
        else
            this.years = years;
    }


}