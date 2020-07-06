package Composition;

public class Table implements Element {
    private String _title;

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public Table(String _title) {
        this._title = _title;
    }

    @Override
    public void print() {
        System.out.println("Titlu: " + _title);
    }
}
