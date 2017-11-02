/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author zroehl
 */
public class JavaRegex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pattern phoneP;
        phoneP = Pattern.compile("[(]?([0-9]{3})[-,),.][' ']?([0-9]{3})[-,.]([0-9]{4})");
        
        Scanner numb = new Scanner(System.in);
        System.out.println("Enter phone number: ");
        String number = numb.nextLine();
        
        while(!number.equals(""))
        {
            Matcher phoneM = phoneP.matcher(number);
            if(phoneM.matches())
            {
                String areaCode = phoneM.group(1);
                String officeCode = phoneM.group(2);
                String lineNumber = phoneM.group(3);
                
                System.out.println("Phone number: (" + areaCode + ") "
                        + officeCode + "-" + lineNumber);
            }
            System.out.println("Enter phone number: ");
            number = numb.nextLine();
        }
        
        numb.close();
    }
    
}
