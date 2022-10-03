public class Processor extends Worker {
    //data (that isn't inherited)
    double bonusTarget;

    //Parameterized constructor
    void Processor(String name, int rating, int id) {
        super.Worker(name, rating, id);
    }

    //calculateBonus will return the bonus earned by each instance.
    double calculateBonus(double multiplier) {
        return bonusTarget * multiplier;
    }

    //compareTo
    public int compareTo(Worker worker)
    {
        return super.compareTo(worker);
    }
    public String toString()
    {
        return super.toString();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
