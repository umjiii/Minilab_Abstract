public abstract class Worker implements Comparable {
    //data
    String name;
    int rating;
    int id;

    //parameterized constructor to be inherited
    void Worker(String name, int rating, int id){
        if (this.rating <= 5 || this.rating > 1)
        {
            this.rating = rating;
        }
        else throw new IllegalArgumentException("The rating must be greater than/equal to 1, and greater than/equal to 5.");
    }

    /*compareTo returns positive if the worker's rating is greater than that of the worker being compared to, negative if less than, and returns the same results by
    checking the IDs of each worker if the ratings are equal. If the IDs are equal, the method will return 0.*/
    int compareTo(Worker worker)
    {
    if ((worker.rating - rating) != 0) return (worker.rating - rating);
    else
    {
        return (worker.id - id);
    }
    }

    //calculateBonus is abstract and will have no body.
    abstract void calculateBonus();









}
