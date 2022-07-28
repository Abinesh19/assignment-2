package week2.day5;

public class Calculator {
	public int add(int a,int b) {
		// TODO Auto-generated method stub
int c=a+b;
return c;
	}
public void sub(int add, int b) {
	// TODO Auto-generated method stub
int c=add-b;
System.out.println(c);
}
private void multiply(int a, int b) {
	// TODO Auto-generated method stub
int c=a*b;
System.out.println(c);
}
private void divide(float a, float b) {
	// TODO Auto-generated method stub
float c=a/b;
System.out.println(c);
}
public static void main(String[] args) {
	Calculator calc=new Calculator();
	int add = calc.add(20, 40);
	System.out.println(add);
	calc.sub(70, add);
	calc.multiply(20, 30);
	calc.divide(87, 20);
}
}
