class Manager extends SalaryEmployee {
    private double bonuses;

    public Manager(int id, String name, int age, double salary, double bonuses) {
        super(id, name, age, salary);
        this.bonuses = bonuses;
    }

    public double getBonuses() {
        return bonuses;
    }

    @Override
    public double calcSalary() {
        return getSalary() + getSalary() * bonuses;
    }

    @Override
    public String toString() {
        return super.toString() + " " + (getSalary() + getSalary() * bonuses);
    }
}