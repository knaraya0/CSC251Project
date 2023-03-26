import java.util.Scanner; 
public class Project_kabir_narayan
{ 
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in); //create a new keyboard scanner object
      
      System.out.print("Please enter the Policy Number: "); //get the policy number from the user
      double policyNumber = keyboard.nextDouble();
      
      System.out.print("Please enter the Provider Name: "); //get the provider name from the user
      String policyName = keyboard.nextLine();
      policyName = keyboard.nextLine(); //clear the buffer
      
      System.out.print("Please enter the Policyholder's First Name: "); //get the policyholder's first name from the user
      String policyFirstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: "); //get the policyholder's last name from the user
      String policyLastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's age: "); //get the policyholder's age from the user
      double policyAge = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): "); //get the policyholder's smoking status from the user
      String policySmokingStatus = keyboard.nextLine();
      policySmokingStatus = keyboard.nextLine(); //clear the buffer
      
      System.out.print("Please enter the Policyholder's Height (in inches): "); //get the policyholder's height from the user
      double policyHolderHeight = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): "); //get the policyholder's weight from the user
      double policyHolderWeight = keyboard.nextDouble();
      
      Policy policy1 = new Policy(policyNumber, policyFirstName, policyLastName, policyAge, policySmokingStatus, policyHolderHeight, policyHolderWeight); //use the constructer to create a new instance of Policy with the values the user entered
      
      System.out.println("Policy Number: " + policyNumber); //display the policy number
      System.out.println("Provider Name: " + policyName); //display the provider name
      System.out.println("Policyholder's First Name: " + policyFirstName); //display the policyholder's first name
      System.out.println("Policyholder's Last Name: " + policyLastName); //display the policyholder's last name
      System.out.println("Policyholder's Smoking Status: " + policySmokingStatus); //display the policyholder's smoking status
      System.out.println("Policyholder's Height: " + policyHolderHeight); //display the policyholder's height
      System.out.println("Policyholder's Weight: " + policyHolderWeight); //display the policyholder's weight
      System.out.printf("Policyholder's BMI: %.2f\n", policy1.getBMI()); //display the policyholder's BMI
      System.out.printf("Policy Price: $%.2f\n", policy1.getInsurancePolicyPrice()); //display the policy price
   }
}