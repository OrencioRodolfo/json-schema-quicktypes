package io.quicktype;

public class BetPlacementEventPayload {
    private double betID;
    private String betPlacedTime;
    private String betReceiptID;
    private Double totalPotentialWin;
    private Double totalStake;

    public double getBetID() { return betID; }
    public void setBetID(double value) { this.betID = value; }

    public String getBetPlacedTime() { return betPlacedTime; }
    public void setBetPlacedTime(String value) { this.betPlacedTime = value; }

    public String getBetReceiptID() { return betReceiptID; }
    public void setBetReceiptID(String value) { this.betReceiptID = value; }

    public Double getTotalPotentialWin() { return totalPotentialWin; }
    public void setTotalPotentialWin(Double value) { this.totalPotentialWin = value; }

    public Double getTotalStake() { return totalStake; }
    public void setTotalStake(Double value) { this.totalStake = value; }
}
