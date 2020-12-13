package com.raja.jaisankar;

import java.util.Scanner;

public class basics {
    public void primeres()
    {
        int i=2;
        boolean flag=false;

        Scanner scanner = new Scanner(System.in);
        int ipnum = scanner.nextInt();

        while (i <= ipnum/2) {
                if (ipnum%i==0){
                    flag=true;
                    break;
                }
                i++;
        }

        System.out.print(flag?"prime":"not a prime");
    }
}
