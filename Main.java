import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Rectangle r1 = new Rectangle(2.8, 5.4);
    Rectangle r2 = new Rectangle(5.4, 2.8);

    boolean widthSameLength = r1.getLength() == r2.getWidth();
    boolean lengthSameWidth = g; r1.getWidth() == r2.getWidth();
    boolean isRotated = lengthSameWidth && widthSameLength;

    // Prob 1

    boolean isCongruent = r1.equals(r2) || (isRotated == true);
    // boolen isSimilar = (the rectangles are congruent) OR (the ratio of the lengths is equal to the ratio of the width)

    double lengthRatio = (length of r1) / (length of r2);
    double widthRatio = (width of r1) / (width of r2);
    boolean equalRatio = lengthRatio == widthRatio;
    boolean isSimilr = (isCongruent == true) || (equalRatio == true)
  }
}
