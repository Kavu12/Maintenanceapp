package fr.r6a06;

public class Movie {
    public static final int  CHILDRENS = 2;
    public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;

    private String _title;
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        this.setPriceCode(priceCode);
    }
    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case 2:
                _price = new ChildrensPrice() ;
                break;
            case 1:
                _price = new NewReleasePrice();
                break;
            case 0:
                _price = new RegularPrice();
                break;
        }
    }
    public Price getPriceCode() {
        return _price;
    }
    public void setPriceCode(Price arg) {
        _price = arg;
    }
    public String getTitle (){
        return _title;
    };

    public double getChargeResult(int dayRental) {
        /*double result = 0.0;
        switch (this._priceCode) {
            case Movie.REGULAR:
                result += 2;
                if (dayRental > 2)
                    result += (dayRental - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += dayRental * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (dayRental > 3)
                    result += (dayRental - 3) * 1.5;
                break;
        }
        return result;*/
        return _price.getCharge(dayRental);
    }

    public int getFrequentRenterPointsResult(int _daysRented) {
        if ((_price.getPriceCode() == Movie.NEW_RELEASE) &&
                _daysRented > 1)
            return 2;
        return 1;
    }
}