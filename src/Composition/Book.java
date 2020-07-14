package Composition;

import java.nio.charset.spi.CharsetProvider;
import java.util.ArrayList;

public class Book {

    private String _title;
    public ArrayList<Element> content;
    private Author _author;

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public Book(String _title) {
        this._title = _title;
        content = new ArrayList<Element>();
    }

    public void print() {
        System.out.println("Book: " + _title);
        System.out.println("Author: "+_author.get_name());

        for(Element element : content){
            element.print();
        }
    }

    public void addAuthor(Author author) {
        this._author = author;
    }

    public void addContent(Element element){
        content.add(element);
    }
}
