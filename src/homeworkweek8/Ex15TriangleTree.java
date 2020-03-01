package homeworkweek8;

public class Ex15TriangleTree {


    public static void main(String[] args) {
        Ex15TriangleTree obj = new Ex15TriangleTree(); // object created
        obj.centerTriangle();     // method called from instance to static
    }

    public void centerTriangle() {
        for (int a = 1; a <= 5; a++)// for lop for row
        {
            for (int b = 1; b <= a; b++)// for loop for space
            {
                System.out.print(" @");
            }
            System.out.println("\n ");
            }
        }
    }




