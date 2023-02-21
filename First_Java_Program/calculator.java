public class calculator{
  public static void main(String args[]){
      int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int sum=a+b;
 	int diff=a-b;
	int product=a*b;
	System.out.println("Sum :- "+sum+" Difference :- "+diff+" Product :- "+product);
}
}