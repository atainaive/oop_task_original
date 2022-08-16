package module;

public class Euro implements Comparable<Euro> {
    private final int value;

    public Euro(int value) {
        this.value = value;
    }

    public Euro(Euro euro) {
        this(euro.value);
    }

    public Euro(int euro, int cents) {
        this(euro + 100 + cents);
    }

    public Euro add(Euro euro) {
        return new Euro(this.value + euro.value);
    }

    public Euro sub(Euro euro) {
        return new Euro(this.value - euro.value);
    }

    Euro mul(int k) {
        return new Euro(this.value * k);
    }

    @Override
    public String toString() {
        return value / 100 + "." + value % 100 / 10 + value % 10;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        Euro o = (Euro) object;

        return this.value == o.value;
    }


    public int compareTo(Euro o) {
        return this.value - o.value;
    }

    public Euro mul(double x, RoundMethods roundMethod, int d) {
        return new Euro(roundMethod.round(value * x, d));
    }

    public Euro round(RoundMethods roundMethod, int d) {
        return new Euro(roundMethod.round(value, d));
    }
}
