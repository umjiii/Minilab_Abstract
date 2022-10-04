/*
CSC205: #14891 / Monday 11AM-1PM
Minilab: 4
Author: Stephen Arel
Description: This class, child of worker, can do all the same things a worker can, with calculateBonus
method returning 0 because a tech worker does not get a bonus. Like any other worker, it can be compared to other workers.
 */

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

    //toString
    public String toString() {
        return super.toString();
    }

}
