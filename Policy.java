public class Policy //create the Policy class
{
   private double policyNumber; //create the instance field variables
   private PolicyHolder policyHolder;
   public static counter;
   
   public Policy(double pn, String pfn, String plm, double pa, String pss, double ph, double pw) //the constructor which accepts arguments
   {
      policyNumber = pn;
      policyFirstName = pfn;
      policyLastName = plm;
      policyAge = pa;
      policySmokingStatus = pss;
      policyHeight = ph;
      policyWeight = pw;
      counter++;
   }
      public double getInsurancePolicyPrice()//method that calculates the insurance policy price
   {
      double BMI = getBMI(); 
      double insurancePolicyPrice = 600;
      
      if (policyAge >= 50)
         insurancePolicyPrice += 75;
      if (policySmokingStatus.equals("smoker"))
         insurancePolicyPrice += 100;
      if (BMI >= 35)
         insurancePolicyPrice += (BMI - 35) * 20;
      
      return insurancePolicyPrice;
   }
}
      