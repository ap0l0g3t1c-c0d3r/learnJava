package ClassesExercise;

public class Demo {
	public static void main(String[] args) {
		
		int n = 100;
        String s = String.valueOf(n);
        if(s.getClass() == String){
            System.out.println("Good Job");
        }else{
            System.out.println("Wrong Answer");
        }





        System.out.print("Hi trial");
        System.out.print(s.getClass());
		
	}
}
