package com.session.six;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class ObjectOperation {

    private String fileName;
    public ObjectOperation(String fileName){
        this.fileName = fileName;
    }
    public static void main(String[] args) throws  Exception{
       ObjectOperation obj = new ObjectOperation("userDetails2.txt");
        UserDetails user1 = new UserDetails("parv","musty","pmusty","12345678");
        UserDetails user2 = new UserDetails("Solmon","dave","sdave","register1");
        UserDetails user3 = new UserDetails("Solmon2","john","sjohn","register2");
        
       obj.writeFile(user1);
       obj.writeFile(user2);
        obj.writeFile(user3);
        List<UserDetails> outList = obj.readFile();
        System.out.println(outList);

    }


    public void writeFile(UserDetails user){
        try {

            FileOutputStream f = new FileOutputStream(this.fileName,true);
            if(new File(this.fileName).length() ==0){
                ObjectOutputStream o = new ObjectOutputStream(f);
                o.writeObject(user);
                o.close();
            }else{
                MyOutputStream myOutputStream = new MyOutputStream(f);
                myOutputStream.writeObject(user);
                myOutputStream.close();
            }


            f.close();
        } catch (FileNotFoundException e) {
        System.out.println("File not found");
    } catch (IOException e) {
        System.out.println("Error initializing stream " + e);
        e.printStackTrace();

    } 
    }
    public List<UserDetails> readFile() throws FileNotFoundException,IOException,ClassNotFoundException{
        List<UserDetails> ud1 = new ArrayList<>();
        try {
            FileInputStream fi = new FileInputStream(this.fileName);
            ObjectInputStream oi = new ObjectInputStream(fi);
            if (oi != null) {
                    while (true) {
                        try {
                           UserDetails data = (UserDetails)  oi.readObject();
                            if(data != null)
                                ud1.add(data);
                    } catch(EOFException eof){
                            // eof.printStackTrace();
                           // System.out.println("EOF reached");
                            break;
                        }
                }
            }
            oi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream " + e);

        } catch (ClassNotFoundException e) { // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ud1;
    }
}
