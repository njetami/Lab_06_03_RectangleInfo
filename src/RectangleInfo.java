import java.util.Scanner;

public class RectangleInfo {
    public static <quotient> void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double length =0;
        double width =0;
        double area = 0;
        double perimeter = 0;
        double diagonLength =0;

        System.out.print("enter the length of the rectangle: ");
        if(in.hasNextDouble())
        {
            length =in.nextDouble();
            area = length * width;
            perimeter = 2*( length  + width );
            diagonLength = (length * length + width * width)/2;
            in.nextLine();
        }

        else{
            System.out.println("invalid");
        }

        System.out.print("enter the width of the rectangle: ");
        if(in.hasNextDouble())
        {
            width =in.nextDouble();
            in.nextLine();
        }

        else{
            System.out.println("invalid");
        }

        System.out.println("The length of the rectangle is : " + length);
        System.out.println("The width of the rectangle is : " + width);
        System.out.println("The area of the rectangle is : " + length * width );
        System.out.println("The perimeter of the rectangle is : " + 2*( length  + width ));
        System.out.println("The length of the diagonal of the rectangle is : " + diagonLength);
    }
}
