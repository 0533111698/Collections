package api.bird;

public class pinguin extends Bird {

    public pinguin() {
        super("pingwi");
    }

    @Override
    public String describeTaste() {
        return getNameOfBird()+" is yummy";
    }

    @Override
    public boolean isMainCourse() {
        return true;
    }
}
