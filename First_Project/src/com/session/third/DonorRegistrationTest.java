package com.session.third;
//abstraction example
public class DonorRegistrationTest {
    public static void main(String[] args) {
           VerifyDonorRegistration obj = new VerifyDonorRegistration("Karun",20,"1234567890",
                   "B+","eye");
           VerifyDonorRegistration obj2 = new VerifyDonorRegistration("Karun1",15,"1234567890",
                   "O+","leg");
          // System.out.println(obj);
           //System.out.println(obj2);
           
         VerifyDonorRegistration [] array = new VerifyDonorRegistration[2];
           array[0]=obj;
           array[1]=obj2;
           for(VerifyDonorRegistration single : array){
               System.out.println(single);
           }



       }
}


