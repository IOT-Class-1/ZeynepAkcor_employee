package merveGundogmus_mext.inheritance;

public class Salesperson extends Employee{
    private double commissionpercentage;

    public Salesperson(String name, double salary, int age, double commissionpercentage) {
        super(name, salary, age);
        this.commissionpercentage = commissionpercentage;
    }

    public double getCommissionpercentage() {
        return this.commissionpercentage;
    }

    public  void raiseCommission() {
        if (this.commissionpercentage < .30) {
            this.commissionpercentage = this.commissionpercentage * 1.2;
        }
    }

}
