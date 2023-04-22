public class Policy //create the Policy class
{
   private double policyNumber; //create the instance field variables
   private PolicyHolder policyHolder;
   public static int counter;
   
   public Policy(double pn, PolicyHolder ph) //the constructor which accepts arguments
   {
      policyNumber = pn;
      policyHolder = ph;
      counter++;
   }
      public double getInsurancePolicyPrice()//method that calculates the insurance policy price
   {
      double BMI = policyHolder.getBMI(); 
      double insurancePolicyPrice = 600;
      
      if (policyHolder.getAge() >= 50)
         insurancePolicyPrice += 75;
      if (policyHolder.getSmokingStatus().equals("smoker"))
         insurancePolicyPrice += 100;
      if (BMI >= 35)
         insurancePolicyPrice += (BMI - 35) * 20;
      
      return insurancePolicyPrice;
      
   }
   public String toString()
   {
      return String.format("policy number: " + policyNumber + 
             "\n policy holder: " + policyHolder + "\npolicy price: " + getInsurancePolicyPrice());
   }
}

      