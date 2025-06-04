package io.quicktype;

public class Payload {
    private double betID;
    private String betPlacedTime;
    private String betReceiptID;
    private double totalPotentialWin;
    private double totalStake;

    public double getBetID() { return betID; }
    public void setBetID(double value) { this.betID = value; }

    public String getBetPlacedTime() { return betPlacedTime; }
    public void setBetPlacedTime(String value) { this.betPlacedTime = value; }

    public String getBetReceiptID() { return betReceiptID; }
    public void setBetReceiptID(String value) { this.betReceiptID = value; }

    public double getTotalPotentialWin() { return totalPotentialWin; }
    public void setTotalPotentialWin(double value) { this.totalPotentialWin = value; }

    public double getTotalStake() { return totalStake; }
    public void setTotalStake(double value) { this.totalStake = value; }
}
