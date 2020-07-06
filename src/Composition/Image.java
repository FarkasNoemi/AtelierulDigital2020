package Composition;

public class Image implements Element {

    private String _imageName;

    public Image(String imageName) {
        _imageName = imageName;
    }

    public String getImageName() {
        return _imageName;
    }

    public void setImageName(String imageName) {
        _imageName = imageName;
    }

    @Override
    public void print() {
        System.out.println("Image name: " + _imageName);
    }
}
