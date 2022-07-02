package com.session.third;
//inheritance, overriding, implementation examples
public class VerifyDonorRegistration extends DonorRegistration implements CheckEligibility{
    private int age ;
    public VerifyDonorRegistration(String name, int age, String contact_number, String blood_group, String organ) {
        super(name,age,contact_number,blood_group,organ);
        this.age = age;
}

   public boolean isEligible(){
        boolean result = false;
        if(this.age >=18)
            result = true;
        return result;
}
    @Override
public String toString() {
        return "VerifyDonorRegisteration{" +
                "name="+getName()+
                " age=" + age +
                " contact number="+getContact_number()+
                " Blood Group="+getBlood_group()+
                " Organ="+getOrgan()+
                " Eligible="+isEligible()+
                '}';
}
}
