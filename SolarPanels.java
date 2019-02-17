/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarpanels;
import java.lang.Math.*;
import java.util.ArrayList;

/**
 *
 * @author Andrew
 */
public class SolarPanels { 
     public static void main(String[] args) {
        int[] a = answer(15324);
        System.out.println("My list: ");
        for (int i = 0; i <= a.length-1; i ++)
            System.out.println(a[i]);
    }
    
    public static int[] answer(int area) { //implemented answer method
    ArrayList<Integer> panelsCut = new ArrayList();
        if(area >= 1 && area <= 1000000){//check for valid input
            for(int i = area; i > 0 && area > 0; i--){ //iterate 
                System.out.println("i: " + i);
                System.out.println("area " + area);
                int sqrt = (int) Math.sqrt(i);
                if(sqrt*sqrt == i){//until we find largest perfect square
                    System.out.println("\n~~~~~\nadded " + i + "\n~~~~~\n");
                    panelsCut.add(i);       //add it to the list of panels
                    area += (-1*i);//cut the panel
                    i = area;//set new i to match
                }

                if(i==1)//bandaid for lack of a better solution
                    i++;
            }
        }    
        else
            System.exit(0); //invalid input 
    int[] list = new int[panelsCut.size()];
    for(int j = 0; j <= panelsCut.size()-1; j++)
        list[j] = panelsCut.get(j);
    return list;
    } 
}
