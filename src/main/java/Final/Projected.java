package Final;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Projected {
    static List<Projected> projectedList;
    private int year;
    private double amount;
    private double interest;
    private double ending;

    public Projected(int year, double amount, double interest, double ending) {
        this.year = year;
        this.amount = amount;
        this.interest = interest;
        this.ending = ending;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getEnding() {
        return ending;
    }

    public void setEnding(double ending) {
        this.ending = ending;
    }

    public static List<Projected> CalcProjected(Saving saving) {
        projectedList = new ArrayList<>();
        double amount = saving.getCdep();
        boolean isDeluxe = (saving.getSavtype().equals("Saving-Deluxe") ? true : false);
        for (int i = 1; i <= saving.getNyears(); i++) {
            double interest = amount * (isDeluxe ? 0.15 : 0.1);
            projectedList.add(new Projected(i, amount, interest, interest + amount));
            amount = interest + amount;
        }
        return projectedList;
    }

}
