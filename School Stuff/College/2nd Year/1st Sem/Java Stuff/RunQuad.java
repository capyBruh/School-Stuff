import java.util.Scanner;

public class RunQuad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a shape:");
            System.out.println("R: Rectangle");
            System.out.println("S: Square");
            System.out.println("P: Parallelogram");
            System.out.println("H: Rhombus");
            System.out.println("T: Trapezoid");
            System.out.println("E: Exit");
            System.out.print("Enter your choice: ");
            char choice = scan.next().toUpperCase().charAt(0);

            switch (choice) {
                case 'R' -> {
                    Rectangle rectangle = new Rectangle();
                    rectangle.showDescription();
                }
                case 'S' -> {
                    Square square = new Square();
                    square.showDescription();
                }
                case 'P' -> {
                    Parallelogram parallelogram = new Parallelogram();
                    parallelogram.showDescription();
                }
                case 'H' -> {
                    Rhombus rhombus = new Rhombus();
                    rhombus.showDescription();
                }
                case 'T' -> {
                    Trapezoid trapezoid = new Trapezoid();
                    trapezoid.showDescription();
                }
                case 'E' -> {
                    scan.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}

class Quadrilateral {
    public void showDescription() {
        System.out.println("- is quadrilateral");
    }
}

class Parallelogram extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 2 pairs of parallel sides");
    }
}

class Rectangle extends Parallelogram {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 right angles");
    }
}

class Square extends Rectangle {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 equal sides");
    }
}

class Rhombus extends Parallelogram {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 congruent sides");
    }
}

class Trapezoid extends Quadrilateral {
    @Override
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 1 pair of parallel sides");
    }
}
