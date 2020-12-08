package com.company;

import java.io.*;

public class Scramble
{
    public static void main(String[]args) throws IOException {
        File fout = new File("C:\\Users\\comed\\Desktop\\input.txt");
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        String arr[]=new String[100];
        String scram="";
        int randomNum=0;
        arr[0]="D";arr[1]="D'";arr[2]="D2";arr[3]="F";arr[4]="F'";arr[5]="F2";arr[6]="U";arr[7]="U'";arr[8]="U2";arr[9]="B";arr[10]="B'";arr[11]="B2";arr[12]="L";arr[13]="L'";arr[14]="L2";arr[15]="R";arr[16]="R'";arr[17]="R2";
        for (int i = 1; i <=100000; i++)
        {
            scram=Integer.toString(i)+"-"+scram;
            for(int j=0;j<25;j++)
            {
                randomNum = 0 + (int)(Math.random() * 18);
                scram=scram+arr[randomNum]+" ";
            }
            bw.write(scram);
            bw.newLine();
            scram="";
        }
        bw.close();
    }
}
