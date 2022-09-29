package com.syntax.class07;

import java.util.Scanner;

public class CountryHW {

	public static void main(String[] args) {
/*
 * Ask user to enter their country and capture it
 * Once values are captured print which language user speaks
 */
		
		Scanner input=new Scanner(System.in);

        System.out.println("Where are you from?");
        String country=input.nextLine();
        String language;

        switch(country.toLowerCase() ) {//.toLowerCase() .toUpperCase()
        case "usa":
            language="English";
            break;
        case "turkey":
            language="Turkish";
            break;
        case "saudi Arabia":
            language="Arabic";
            break;
        case "india":
            language="Hindi";
            break;
        case "spain":
            language="Spanish";
            break;
        case "afghanistan":
            language="Dari Persian";
            break;
        default:
            language="Unknown";
                break;
        }
        System.out.println("You are from "+country+" and your language is "+language);
		
	}

}
