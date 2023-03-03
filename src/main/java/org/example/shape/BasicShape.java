package org.example.shape;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BasicShape{
        static Logger logger=Logger.getLogger("BasicShape.class");

        Scanner scanner = new Scanner(System.in);
        double length;
        double breadth;
        double side1;
        double side2;
        double radius;
        int type;
     public BasicShape() {
        try{
        logger.info("Enter the length:");
        length = scanner.nextFloat();
        logger.info("Enter the breadth:");
        breadth = scanner.nextFloat();
        logger.info("Enter the side1:");
        side1 = scanner.nextFloat();
        logger.info("Enter the side2:");
        side2 = scanner.nextFloat();
        logger.info("Enter the radius:");
        radius = scanner.nextFloat();
      }
            catch (InputMismatchException e){
            logger.log(Level.INFO, () -> "Input is mismatched." + e);
            System.exit(0);
        }
        }
        public void getType() {
            do {
                logger.info("choose one from below.");
                logger.info("1.Rectangle\n2.Triangle\n3.Circle");
                logger.info("Enter the shape type:");
                type = scanner.nextInt();
                Shape sh = new Shape(type, length, breadth, side1, side2, radius);
                logger.log(Level.INFO, () -> "The perimeter of the given shape is:" + sh.perimeter());
                logger.log(Level.INFO, () -> "The area of the given shape is:" + sh.area());
            }while(type<4);
        }
}

