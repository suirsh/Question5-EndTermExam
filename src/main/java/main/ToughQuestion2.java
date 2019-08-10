package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories ca=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	System.out.printf("%.3f",ca.calculateEnergy(bread));
                            System.out.println(" kJ of energy generated from "+ca.calculateCalories(bread)+" calories");
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread & jam
                        	System.out.printf("%.3f",ca.calculateEnergy(bread, jam));
                            System.out.println(" kJ of energy generated from "+ca.calculateCalories(bread, jam)+" calories");
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for  bread,jam & butter
                        	System.out.printf("%.3f",ca.calculateEnergy(bread, jam, butter));
                            System.out.println(" kJ of energy generated from "+ca.calculateCalories(bread, jam, butter)+" calories");
                        	break;
                        }
                       //System.out.printf("%.3f",ca.calculateEnergy());
                       //System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
            }
}
class Calories {
            double calculateEnergy(int number) {
            	double ene = number * 74 * 4.1868;
            	return ene;
            }
            int calculateCalories(int number) {
            //you have to overload this function for three parameters refer the question
            	int cal = number * 74; 
            	return cal;
            }
            double calculateEnergy(int number1, int number2) {
            	double ene = ((number1 * 74)+(number2 * 102)) * 4.1868;
            	return ene;
            }
            int calculateCalories(int number1, int number2) {
                //you have to overload this function for three parameters refer the question
            	int cal = ((number1 * 74)+(number2 * 26));
            	return cal;
                }
            double calculateEnergy(int number1, int number2, int number3) {
                //you have to overload this function for three parameters refer the question
            	double ene = ((number1 * 74)+(number2 * 26)+(number3 * 102)) * 4.1868;
            	return ene;
                }
            int calculateCalories(int number1, int number2, int number3) {
                //you have to overload this function for three parameters refer the question
            	int cal = ((number1 * 74)+(number2 * 26)+(number3 * 102));
            	return cal;
                }
            
}