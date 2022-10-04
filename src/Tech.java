public class Tech extends Worker
{
    //Parameterized constructor
    Tech(String theName, int theRating, int theID){
        super(theName, theRating, theID);
    }

    //calculateBonus will return the bonus earned by each instance.

    double calculateBonus(double multiplier) {
        return 0;
    }

    public String toString() {
        return super.toString();
    }

}
