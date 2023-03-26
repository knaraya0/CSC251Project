public class Policy //create the Policy class
{
   private double policyNumber; //create the instance field variables
   private String policyFirstName;
   private String policyLastName;
   private double policyAge;
   private String policySmokingStatus;
   private double policyHeight;
   private double policyWeight;
   
   public Policy(double pn, String pfn, String plm, double pa, String pss, double ph, double pw) //the constructor which accepts arguments
   {
      policyNumber = pn;
      policyFirstName = pfn;
      policyLastName = plm;
      policyAge = pa;
      policySmokingStatus = pss;
      policyHeight = ph;
      policyWeight = pw;
   }
   public double getBMI() //method that calculates the BMI
   {
      double BMI = (policyWeight * 703) / (policyHeight * policyHeight);
      return BMI;
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
      