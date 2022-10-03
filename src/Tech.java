public class Tech extends Worker
{
    //Parameterized constructor
    void Tech(String name, int rating, int id){
        super.Worker(name, rating, id);
    }

    //calculateBonus will return the bonus earned by each instance.

    double calculateBonus(double multiplier) {
        return 0;
    }

    public int compareTo(Worker worker) {
        return super.compareTo(worker);
    }

    public String toString() {
        return super.toString();
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
