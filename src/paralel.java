public class paralel {
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram();

        System.out.println("Perimeter of parallelogram with length 5 and width 7: "
                + parallelogram.calculatePerimeter(5, 7));

        System.out.println("Perimeter of parallelogram with side length 6: "
                + parallelogram.calculatePerimeter(6));

        System.out.println("Area of parallelogram with length 5 and width 7.5: "
                + parallelogram.calculateArea(5, 7.5));

        System.out.println("Area of parallelogram with side length 6: "
                + parallelogram.calculateArea(6));
    }
}
