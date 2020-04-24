public class Command_Line1 {
	
	public static void main(String[] args) {
		int temp = Integer.parseInt(args[0]);
		int sum=temp,max=temp,min=temp;
		float avg;
		for ( int i = 1; i < args.length; i++ ){
			int a=Integer.parseInt(args[i]);
			sum += a;
			if(a>max){
				max = a;
			}
			if(a<min){
				min = a;
			}
		} 
		
		avg = sum/args.length ; 
		
		System.out.println("The sum of given elements is: " + sum);
		System.out.println("The average of given elements is: " + avg);
		System.out.println("The max of given elements is: " + max);
		System.out.println("The min of given elements is: " + min);
	}
}
