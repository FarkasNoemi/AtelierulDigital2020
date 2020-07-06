package Composition;

import java.util.ArrayList;

public class Section implements Element{

    private String sectionTitle;
    public ArrayList<Element> content;

    public Section(String sectionTitle) {
        this.sectionTitle = sectionTitle;
        content = new ArrayList<Element>();
    }

    public String getSectionTitle() {
        return sectionTitle;
    }

    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public ArrayList<Element> getContent() {
        return content;
    }

    public void setContent(ArrayList<Element> content) {
        this.content = content;
    }

    public void add(Element element){
        content.add(element);
    }

    public void remove(Element element){
        content.remove(element);
    }

    public Element getElement(int indexOfElement){
        return content.get(indexOfElement);
    }

    @Override
    public void print() {
        System.out.println("Title: "+getSectionTitle());

        for (Element element : content){
            element.print();
        }

    }
}
