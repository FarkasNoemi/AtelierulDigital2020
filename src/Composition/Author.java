package Composition;

import java.util.ArrayList;

public class Author {

    private String _name;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public Author(String _name) {
        this._name = _name;
    }

    public void print(){
        System.out.println("Author name: " + _name);
    }

}
