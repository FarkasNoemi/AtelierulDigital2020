package Proxy;

public class ImageProxy implements Element {

    public String ImageName;
    private Image _realImage;

    public ImageProxy(String imageName){
        this.ImageName = imageName;
    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String imageName) {
        ImageName = imageName;
    }

    public Image get_realImage() {
        return _realImage;
    }

    public void set_realImage(Image _realImage) {
        this._realImage = _realImage;
    }

    @Override
    public void print() {
        _realImage = new Image(getImageName());
        _realImage.print();
    }
}