package a_plus_b;

import java.io.*;
import java.util.*;
public class a_plus_b {
     public static void main(String[] args) throws IOException {
         String str;
         int sum=0;

         FileReader reader = new FileReader("src/a_plus_b/input.txt");
         FileWriter fileWriter = new FileWriter("src/a_plus_b/output.txt");
         Scanner scanner = new Scanner(reader);
         str = scanner.nextLine();
         StringTokenizer stringTokenizer = new StringTokenizer(str," ");
         while(stringTokenizer.hasMoreElements()){
             String token = stringTokenizer.nextToken();
             sum=sum+Integer.parseInt(token);
         }
         fileWriter.write(String.valueOf(sum));

         reader.close();
         fileWriter.close();
     }
}