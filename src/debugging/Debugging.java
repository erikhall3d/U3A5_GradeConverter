/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package debugging;

import java.util.*;
/**
 *
 * @author erhal8376
 */
public class Debugging {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double type;         

        System.out.println("MAIN MENU");
        System.out.println("=========");
        System.out.println("1. Convert to a Letter grade");
        System.out.println("2. Convert to a Level grade");
        System.out.println("3. Exit \n");
        System.out.println("Please enter your selection: ");
        type=sc.nextInt();

        if (type==1) percentageToAlpha();  
        if (type==2) percentageToLevel();
	if (type==3) {
            System.exit(0);
        }
    }

    // Conversion function percentage to Alpha
    public static void percentageToAlpha ()
    {
	double grade;  
	String alphaGrade = null;
	String messageOut;

	System.out.println("Please enter the numeric grade: "); 
	grade=sc.nextInt();

	if (grade<0) {
            alphaGrade = "Error - invalid mark, try again!";
        }
        else if ((grade>=0) && (grade < 50)) {
		alphaGrade="F";
	}
        else if ((grade >= 50) && (grade <=52))
	{
		alphaGrade = "D-";
	}
        else if ((grade >= 53) && (grade <=56))
	{
		alphaGrade = "D";
	}
        else if ((grade >= 57) && (grade <=59))
	{
		alphaGrade = "D+";
	}
        else if ((grade >= 60) && (grade <=62))  
	{
		alphaGrade = "C-";
	}
        else if ((grade >= 63) && (grade <=66))
	{
		alphaGrade = "C";
	}
        else if ((grade >= 67) && (grade <=69))
	{
		alphaGrade = "C+";
	}
        else if ((grade >= 70) && (grade <=72))
	{
		alphaGrade = "B-";
	}
        else if ((grade >= 73) && (grade <=76))
	{
		alphaGrade = "B";
	}
        else if ((grade >= 77) && (grade <=79))
	{
		alphaGrade = "B+";
	}
        else if ((grade >= 80) && (grade <=84))
	{
		alphaGrade = "A-";
	}
        else if ((grade >= 85) && (grade <=89))
	{
		alphaGrade = "A";
	}
        else if ((grade >= 90) && (grade <=100))
	{
		alphaGrade = "A+";
	}
        else
        {
                alphaGrade = "Error - invalid mark, try again!";
	}

	messageOut=(grade + "% = " + alphaGrade);
	System.out.println(messageOut);
    }

    // Conversion function percentage to level
    public static void percentageToLevel ()

    {
	int grade=0;
	String levelGrade="";
	String messageOut;

	System.out.println("Please enter the numeric grade: ");
	grade=sc.nextInt();
        
        if (grade >= 0) {
            if (grade < 50) 
            {
                levelGrade="R";
            }
            else if ((grade >= 50) && (grade <=52))
            {
                    levelGrade="L1-";
            }
            else if ((grade >= 53) && (grade <=56))
            {
                    levelGrade="L1";
            }
            else if ((grade >= 57) && (grade <=59))
            {
                    levelGrade="L1+";
            }
            else if ((grade >= 60) && (grade <=62))
            {
                    levelGrade="L2-";
            }
            else if ((grade > 63) && (grade <=66))
            {
                    levelGrade="L2";
            }
            else if ((grade >= 67) && (grade <=69))
            {
                    levelGrade="L2+";
            }
            else if ((grade >= 70) && (grade <=72))
            {
                    levelGrade="L3-";
            }
            else if ((grade >= 73) && (grade <=76))
            {
                    levelGrade="L4";                   
            }
            else if ((grade >= 77) && (grade <=79))
            {
                    levelGrade="L3+";
            }
            else if ((grade >= 80) && (grade <=84))
            {
                    levelGrade="L4-";
            }
            else if ((grade >= 85) && (grade <=89))
            {
                    levelGrade="L4";
            }
            else if ((grade >= 90) && (grade <=100))   
            {
                    levelGrade="L4+";
            }
            else if (grade>100)
            {
                    levelGrade="Error - invalid mark, try again!";
            }
        }
        else 
        {
            levelGrade="Error - invalid mark, try again!";
        }

	messageOut=(grade + "% = " + levelGrade);  
	System.out.println(messageOut);
    }
}
