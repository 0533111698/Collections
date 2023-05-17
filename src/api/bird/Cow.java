package api.bird;

public class Cow implements IConsumable{
    @Override
    public String describeTaste() {
        return "it's cow of course it's good!";
    }

    @Override
    public boolean isMainCourse() {
        return true;
    }
}
