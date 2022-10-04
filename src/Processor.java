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
