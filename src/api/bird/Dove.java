package api.bird;

public class Dove extends Bird{
    public Dove(String nameOfBird) {
        super(nameOfBird);
    }

    @Override
    public String describeTaste() {
        return getNameOfBird()+"is wierd";
    }

    @Override
    public boolean isMainCourse() {
        return false;
    }
}
