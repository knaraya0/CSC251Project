import java.util.Scanner; 
public class Project_kabir_narayan
{ 
   public static void main(String[] args)
   {
   String createMoreObject = "Y";
   while (createMoreObject.equalsIgnoreCase("Y"))
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
      
      PolicyHolder policyHolder1 = new PolicyHolder(policyFirstName, policyLastName, policyAge, policyHolderHeight, policyHolderWeight, policySmokingStatus); //use the constructer to create a new instance of Policy with the values the user entered
      Policy policy1 = new Policy(policyNumber, policyHolder1);
      
      System.out.println(policy1);
      
      System.out.println("Create another object? Y/N");
      createMoreObject = keyboard.nextLine();
      createMoreObject = keyboard.nextLine();
    }
    System.out.println(Policy.counter);
    
   } 
}