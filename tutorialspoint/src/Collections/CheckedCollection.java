package Collections;

import java.util.*;

public class CheckedCollection {
   public static void main(String args[]) {
      
      // create arraylist       
      ArrayList<String> arlst = new ArrayList<String>();

      // populate the list
      arlst.add("TP");
      arlst.add("PROVIDES");
      arlst.add("QUALITY");
      arlst.add("TUTORIALS");
      

      // create typesafe view of the collection
      Collection<String> tslst;
      tslst = Collections.checkedCollection(arlst,String.class);     

      System.out.println("Type safe view is: "+tslst);
   }    
}