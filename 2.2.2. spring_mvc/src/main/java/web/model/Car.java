package web.model;

public class Car {
    private String firm;
    private int year;
    private String number;

    public Car(String firm, int year, String number) {
        this.firm = firm;
        this.year = year;
        this.number = number;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return firm + ", year: " + year + ", number: " + number + "\n";
    }
}