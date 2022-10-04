public class Specialist extends Worker {
    double bonusTarget;
    double profitSharing;

    //parameterized constructor
    Specialist(String theName, int theRating, int theID, double theBonusTarget, double theProfitSharing)
    {
        super(theName, theRating, theID);
            this.bonusTarget = theBonusTarget;
            this.profitSharing = theProfitSharing;
    }

    //calculateBonus
    double calculateBonus(double multiplier) {
        return (bonusTarget + profitSharing) * multiplier;
    }

    //toString, inherited largely but adds bonusTarget and profitSharing to string
    public String toString() {
        return super.toString() + ", Target:" + bonusTarget + ", Profit: " + profitSharing;


    }
}
