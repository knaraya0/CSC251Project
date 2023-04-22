public class PolicyHolder
{
   private String policyFirstName;
   private String policyLastName;
   private double policyAge;
   private double policyHeight;
   private double policyWeight;
   private String policySmokingStatus;

   public PolicyHolder(String pfn, String plm, double pa, double ph, double pw, String st) //the constructor which accepts arguments
   {
      policyFirstName = pfn;
      policyLastName = plm;
      policyAge = pa;
      policyHeight = ph;
      policyWeight = pw;
      policySmokingStatus = st;
   }
   
   public String toString()
   {
         return String.format("policy holder's first name: " + policyFirstName + 
                "\n policy holder's last name: " + policyLastName + 
                "\n policy holder's age: " + policyAge +
                "\npolicy holder's height: " + policyHeight + 
                "\npolicy holder's weight: " + policyWeight + 
                "\npolicy holder's smoking status: " + policySmokingStatus +
                "\npolicy holder's BMI: " + getBMI());
                
   }
   public double getBMI() //method that calculates the BMI
   {
      double BMI = (policyWeight * 703) / (policyHeight * policyHeight);
      return BMI;
   }
   public double getAge()
   {
      return policyAge;
   }
   public String getSmokingStatus()
   {
      return policySmokingStatus;
   }
   
}