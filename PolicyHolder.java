Public class PolicyHolder
{
   private String policyFirstName;
   private String policyLastName;
   private double policyAge;
   private double policyHeight;
   private double policyWeight;
   private String policySmokingStatus;

   public String toString()
      {
         return String.format("policy holder's first name: " + policyFirstName + 
                "\n policy holder's last name: " + policyLastName + 
                "\n policy holder's age: " + policyAge +
                "\npolicy holder's height: " + policyHeight + 
                "policy holder's weight: " + policyWeight + 
                "policy holder's smoking status: " + policySmokingStatus);
                
      }
}