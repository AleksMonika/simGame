package com.example.demo;

public class Sushi {
    private int rolls;
    private double total;
    private double budget;
    private String sushi;
    private final double Nigiri = 39;
    private final double tomago = 25.5;
    private final double california = 30;

    public Sushi(double availableBudget, int numberOfRolls) {
        budget = availableBudget;
        rolls = numberOfRolls;
    }

    public void setSushi(String chooseSushi) {
        sushi = chooseSushi;
    }

    public void setTotal() {
        switch (sushi.toLowerCase()) {
            case "tomago":
                total = tomago * rolls;
                break;
            case "horror":
                total = Nigiri * rolls;
                break;
            default:
                total = california * rolls;
        }
    }

    public String ifCanGoForSushi() {
        return budget <= total ? "You don't have enough budget" : "You bought " + rolls + (rolls > 1 ? " sushi rolls" : "sushi roll")  + " with total price of " + total + ".";
    }


}
