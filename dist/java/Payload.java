package io.quicktype;

public class Payload {
    private Double betDelay;
    private String betID;
    private double cashedOutQuote;
    private String cashOutToken;
    private Double quote;

    public Double getBetDelay() { return betDelay; }
    public void setBetDelay(Double value) { this.betDelay = value; }

    public String getBetID() { return betID; }
    public void setBetID(String value) { this.betID = value; }

    public double getCashedOutQuote() { return cashedOutQuote; }
    public void setCashedOutQuote(double value) { this.cashedOutQuote = value; }

    public String getCashOutToken() { return cashOutToken; }
    public void setCashOutToken(String value) { this.cashOutToken = value; }

    public Double getQuote() { return quote; }
    public void setQuote(Double value) { this.quote = value; }
}
