package com.session.seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {
 public static void main(String[] args) {
   //order is present, duplicated alowed, random access
List<String> namesList = new ArrayList<>();
namesList.add("dapo");
namesList.add("parv");
namesList.add("gbenga");
namesList.add("musty");
namesList.add("solomon");
namesList.add("pradeep");
namesList.add("dapo");


// printing entire list
System.out.println("entire list "+namesList);

// iterating list, dont delete contents while iterating in for loop
// Datatype referenceName Colon(:) collectionName
for(String element : namesList) {// enhance for looop (
    System.out.println(""+element);
    
}

/// how to delete the elements while iterting it
Iterator<String> it = namesList.iterator();
 while(it.hasNext()) {
     String ele = it.next();
     if (ele.equals("dapo")) {
            it.remove();
            System.out.println("removed element "+ele);
        }
 }
System.out.println("after remove list is "+namesList);
//String[] names={"dapo","parv","gbenga","musty","pradeep","solomon","apple"};
String [] names = {"dapo","parv","gbenga"};
List<String> namesList2 = Arrays.asList(names);
//List<String> nameList2 = new ArrayList(Arrays.asList(names));
 namesList.retainAll(namesList2);
 System.out.println("after retain base list "+namesList);
 
 /// 
 List<Person> personList = new ArrayList<>();
 personList.add(new Person("solmon",22,"male"));
 personList.add(new Person("dapo",22,"male"));
 personList.add(new Person("gbenga",22,"male"));
 personList.add(new Person("musty",22,"male"));
 personList.add(new Person("pradeep",22,"male"));
 Iterator<Person> personItertor = personList.iterator();
 while(personItertor.hasNext()) {
     Person person = personItertor.next();
     if (person.getName().equals("dapo")) {
         personItertor.remove();
            System.out.println("removed element "+person);
        }
 }
System.out.println("after remove list is "+personList);
  
 }//end main method
}// end class