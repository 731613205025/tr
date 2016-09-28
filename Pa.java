/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Pa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int i,n=0;
        float avg;
        int[]a=new int[10];
        Scanner obj=new Scanner(System.in);
        for(i=0;i<10;i++)
            a[i]=obj.nextInt();
        for(i=0;i<10;i++)
            n=n+a[i];
        avg=(float)n/10;
System.out.println("average is:"+avg);
    }
}



