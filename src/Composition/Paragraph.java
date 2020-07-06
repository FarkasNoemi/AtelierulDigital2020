package Composition;

public class Paragraph implements Element{

    private String _text;

    public String get_text() {
        return _text;
    }

    public void set_text(String _text) {
        this._text = _text;
    }

    public Paragraph(String _text) {
        this._text = _text;
    }


    @Override
    public void print() {
        System.out.println("Text: " + _text);
    }
}
