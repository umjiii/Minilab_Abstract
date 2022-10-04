/*
CSC205: #14891 / Monday 11AM-1PM
Minilab: 4
Author: Stephen Arel
Description: This class, child of worker, can do all the same things as a worker class can, with the added
constructor parameter of bonusTarget. This parameter is used to calculate the bonus using a multiplier
and inherits the ability to be compared to any other worker.
 */

public class Processor extends Worker {
    //data (that isn't inherited)
    double bonusTarget;

    //Parameterized constructor
    Processor(String theName, int theRating, int theID, double theBonusTarget)
    {
        super(theName, theRating, theID);
        this.bonusTarget = theBonusTarget;
    }

    //calculateBonus will return the bonus earned by each instance.
    double calculateBonus(double multiplier) {
        return bonusTarget * multiplier;
    }

    //compareTo
    public String toString()
    {
        return super.toString();
    }

}
