package fr.r6a06;

public class ChildrensPrice extends Price{

    public int getPriceCode(){
        return 2;
    }

    public double getCharge(int daysRented){
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
