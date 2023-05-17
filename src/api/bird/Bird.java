package api.bird;

public abstract class Bird implements IConsumable {
    private String nameOfBird;

    public Bird(String nameOfBird) {
        this.nameOfBird = nameOfBird;
    }

    public String getNameOfBird() {
        return nameOfBird;
    }

    public void setNameOfBird(String nameOfBird) {
        this.nameOfBird = nameOfBird;
    }

}
