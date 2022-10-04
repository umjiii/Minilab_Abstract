public abstract class Worker implements Comparable<Worker> {
    //data
    String name;
    int rating;
    int id;

    //default constructor
    Worker(){}

    //parameterized constructor
    Worker(String theName, int theRating, int theID) {
        if (theRating > 5 || theRating < 1) {
            throw new IllegalArgumentException("The rating must be greater than/equal to 1, and greater than/equal to 5.");
        } else {
            this.name = theName;
            this.rating = theRating;
            this.id = theID;
        }
    }

    /*compareTo returns positive if the worker's rating is greater than that of the worker being compared to, negative if less than, and returns the same results by
    checking the IDs of each worker if the ratings are equal. If the IDs are equal, the method will return 0.*/
    public int compareTo(Worker another) {
        if (this.rating > another.rating || this.rating < another.rating) return this.rating - another.rating;
        else{
            return this.id - another.id;
        }
    }

    //calculateBonus is abstract and will have no body.
    abstract double calculateBonus(double multiplier);

    //toString, not hard-coded. This means this method can simply be inherited and function correctly.
    public String toString() {
        this.name = name;
        return getClass().getName() + ": " + this.name + ", Rating: " + this.rating + ", ID: " + this.id;
    }


}
