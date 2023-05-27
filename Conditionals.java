public class Conditionals {

    public static void main(String args[]){
	int num1 = 1234;
    int num2 = 14;
    int num3 = 3666;
	if(num1 > num2 && num1 > num3) {
	  System.out.println("Num1 is the biggest number: " + num1);
	}
	else {
        if (num2 > num3) {
            System.out.println("Num2 is the biggest number: " + num2);
        } else {
            System.out.println("Num3 is the biggest number: " + num3);
        }
    }
   }

}