package fr.r6a06;

public class NewReleasePrice extends Price{

    public int getPriceCode(){
        return 1;
    }

    public double getCharge(int daysRented){
        double result = 0.0;
        result += daysRented * 3;
        return result;
    }
}
