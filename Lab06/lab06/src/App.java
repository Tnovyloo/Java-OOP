import zad1.*;


public class App {
    public static void main(String[] args) throws Exception {

        // Exercise 1-7
        Point[] points = new Point[]{
            new Point(),
            new Point(5, 12),
            new Point(2, 121),
        };

        for (Point point : points) {
            System.out.println(point);
            point.description();
            point.move(4, 3);
            point.description();
            // point.clear();
            point.description();
            System.out.println("\n");
        }

        // Exercise 8 - 10
        Figura figura = new Figura(points[1]);
        System.out.println(figura.opis());

        Okrag[] okregi = new Okrag[]{
            new Okrag(),
            new Okrag(new Point(5, 12), 5),
            new Okrag(points[1], 6),
        };

        for (Okrag okrag : okregi) {
            System.out.println(okrag);
            System.out.println(okrag.getPowierzchnia());
            System.out.println(okrag.getSrednica() + "\n");
        }

        // Exercise 11 - 12
        Prostokat prostokat = new Prostokat(15, 10, "Czerwony");
        System.out.println(prostokat.getKolor());
        System.out.println(prostokat.getX() + " " + prostokat.getY());

        // Exercise 13
        Trojkat trojkat = new Trojkat(3, 5, "Zielony");
        System.out.println(trojkat);
        System.out.println(trojkat.getKolor());

        // Exercise 14 - 15
        prostokat.przesun(3, 5);
        System.out.println("\nProstokat przesuniety: " + prostokat.getX() + " " + prostokat.getY());

        // Exercise 16 - 17
        Kwadrat kwadrat = new Kwadrat(5, 5, "Fioletowy");
        System.out.println(kwadrat.getX() + " " +  kwadrat.getY() + " ");

        // Exercise 18 - 19
        System.out.println(kwadrat.opis());

        // Exercise 20
        Okrag okrag1 = new Okrag(points[2], 5, "Niebieski");
        System.out.println(okrag1.opis());
    }
}
