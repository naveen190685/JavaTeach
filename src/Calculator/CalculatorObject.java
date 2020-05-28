package Calculator;

import java.util.Scanner;

public class CalculatorObject {

	public static void main(String[] args) {
		
/*		SimpleCalculator sc1=new SimpleCalculator();
		int x=12 ,y=4;
		System.out.println(x + " / " + y + " = " + sc1.divide(x, y));
		System.out.println(x + " + " + y + " = " + sc1.sum(x, y));
		System.out.println(x + " - " + y + " = " + sc1.minus(x, y));
		System.out.println(x + " * " + y + " = " + sc1.multiply(x, y));
		
		SimpleCalculator sc2=new SimpleCalculator();
		x=10 ;
		y=5;
		System.out.println(x + " / " + y + " = " + sc2.divide(x, y));
		System.out.println(x + " + " + y + " = " + sc2.sum(x, y));
		System.out.println(x + " - " + y + " = " + sc2.minus(x, y));
		System.out.println(x + " * " + y + " = " + sc2.multiply(x, y));
		
		//System.out.println(SimpleCalculator.getCount()+ " time(s) Simple Calcualtor has been Initiated ");
		
		SuperCalculator suc1=new SuperCalculator();
		float j=2,k=10;
		System.out.println("Exponential of "+j+" = " +suc1.exponential(j)) ;
		System.out.println("Log of "+j+" = "+suc1.log(j));
		System.out.println("Percentage of "+j+" to "+k+" = "+suc1.percentage(j, k)+"%");
		System.out.println(j + " / " + k + " = " + sc2.divide(j,k));
		System.out.println(j + " + " + k + " = " + sc2.sum(j,k));
		System.out.println(j + " - " + k + " = " + sc2.minus(j,k));
		System.out.println(j + " * " + k + " = " + sc2.multiply(j,k));
		
		SuperCalculator suc2=new SuperCalculator();
		float j2=20,k2=50;
		System.out.println("Exponential of "+j2+" = " +suc2.exponential(j2)) ;
		System.out.println("Log of "+j2+" = "+suc1.log(j2));
		System.out.println("Percentage of "+j2+" to "+k2+" = "+suc2.percentage(j2, k2)+"%");
		System.out.println(j2 + " / " + k2 + " = " + suc2.divide(j2,k2));
		System.out.println(j2 + " + " + k2 + " = " + suc2.sum(j2,k2));
		System.out.println(j2 + " - " + k2 + " = " + suc2.minus(j2,k2));
		System.out.println(j2 + " * " + k2 + " = " + suc2.multiply(j2,k2));
		
		SuperCalculator suc3=new SuperCalculator();
		int j3=20,k3=50;
		System.out.println("Exponential of "+j3+" = " +suc3.exponential(j3)) ;
		System.out.println("Log of "+j3+" = "+suc1.log(j3));
		System.out.println("Percentage of "+j3+" to "+k3+" = "+suc3.percentage(j3, k3)+"%");
		System.out.println(j3 + " / " + k3 + " = " + suc3.divide(j3,k3));
		System.out.println(j3 + " + " + k3 + " = " + suc3.sum(j3,k3));
		System.out.println(j3 + " - " + k3 + " = " + suc3.minus(j3,k3));
		System.out.println(j3 + " * " + k3 + " = " + suc3.multiply(j3,k3));
		
		System.out.println(SimpleCalculator.getCount()+ " time(s) Simple Calcualtor has been Initiated ");
		System.out.println(SuperCalculator.getCount()+ " time(s) Super Calcualtor has been Initiated ");
	*/
		System.out.println("**Options Menu Loop**");
		System.out.println("Do you want to calculate?(Y/N)");
		Scanner ip=new Scanner(System.in);
		String ans=ip.next();
		System.out.println(ans);
		while(!ans.equalsIgnoreCase("N")) {
			System.out.println("Which Calculator do you want to use?"
					+ "\nEnter a for Basic Calculator\n"
					+ "Enter b for Scientific Calculator\n"
					+ "Enter N or n again to quit");
			ans=ip.next();
			switch (ans) {
			case "a":
				System.out.println("BASIC CALCULATOR!!");
				SimpleCalculator s=new SimpleCalculator();
				System.out.println("Enter first number : ");
				int x1=ip.nextInt() ;
				System.out.println("Enter Second number : ");
				int y1=ip.nextInt();
				System.out.println(x1 + " / " + y1 + " = " + s.divide(x1, y1));
				System.out.println(x1 + " + " + y1 + " = " + s.sum(x1, y1));
				System.out.println(x1 + " - " + y1 + " = " + s.minus(x1, y1));
				System.out.println(x1 + " * " + y1 + " = " + s.multiply(x1, y1));
				System.out.println(SimpleCalculator.getCount()+ " time(s) Simple Calcualtor has been Initiated ");
				break;
			case "b":
				System.out.println("SUPER CALCULATOR!!");
				SuperCalculator sc=new SuperCalculator();
				System.out.println("Enter first number : ");
				float jj=ip.nextFloat() ;
				System.out.println("Enter Second number : ");
				float kk=ip.nextFloat();
				System.out.println("Exponential of "+jj+" = " +sc.exponential(jj)) ;
				System.out.println("Log of "+jj+" = "+sc.log(jj));
				System.out.println("Percentage of "+jj+" to "+kk+" = "+sc.percentage(jj, kk)+"%");
				System.out.println(jj + " / " + kk + " = " + sc.divide(jj,kk));
				System.out.println(jj + " + " + kk + " = " + sc.sum(jj,kk));
				System.out.println(jj + " - " + kk + " = " + sc.minus(jj,kk));
				System.out.println(jj + " * " + kk + " = " + sc.multiply(jj,kk));
				System.out.println(SuperCalculator.getCount()+ " time(s) Super Calcualtor has been Initiated ");
				break;
			case "N":
				System.out.println("BBYE!!");
				break;
			case "n":
				System.out.println("BBYE!!");
				break;
			default:
				System.out.println("Do you want to Continue?(Y/N)");
				ans=ip.next();
				break;
			}
		}
		
	}

}
