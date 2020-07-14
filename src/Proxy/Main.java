package Proxy;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        ImageProxy img1 = new ImageProxy("Ana");
        ImageProxy img2 = new ImageProxy("Maria");
        ImageProxy img3 = new ImageProxy("Ionela");

        Section IonS1 = new Section("Front Cover");
        IonS1.add(img1);
        Section IonS2 = new Section("Summer vibes");
        IonS2.add(img2);
        IonS2.add(img3);

        Book ion = new Book("Ion");
        ion.addContent(IonS1);
        ion.addContent(IonS2);

        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime - startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        IonS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime - startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        IonS2.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime - startTime) + " milliseconds");
    }
}