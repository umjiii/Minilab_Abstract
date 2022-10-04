/*
CSC205: #14891 / Monday 11AM-1PM
Minilab: 4
Author: Stephen Arel
Description: This class, child of worker, can construct a specialist type of worker, with the added
constructor parameters of bonusTarget and profitSharing. It can calculate the bonus of this specialist using a multiplier,
compare it to other workers, and do all the same things a parent worker can do.
 */

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
