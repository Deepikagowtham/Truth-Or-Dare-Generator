package generate;

public class Generate {
    int MIN = 1;
    int MAX = 10;

    public int generateQuestion() {
        double d = (Math.random() * (MAX)) + MIN;
        return (int)d;
    }
}
