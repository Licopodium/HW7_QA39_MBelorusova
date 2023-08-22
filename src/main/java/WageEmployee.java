class WageEmployee extends Employee {
    private double hourPrice;
    private int hours;

    public WageEmployee(int id, String name, int age, double hourPrice, int hours) {
        super(id, name, age);
        this.hourPrice = hourPrice;
        this.hours = hours;
    }

    public double getHourPrice() {
        return hourPrice;
    }

    public int getHours() {
        return hours;
    }
    @Override
    public double calcSalary() {
        return hourPrice * hours;
    }

    @Override
    public String toString() {
        return super.toString() + " " + (hourPrice * hours);
    }
}