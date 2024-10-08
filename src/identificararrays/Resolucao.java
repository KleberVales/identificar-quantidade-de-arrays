package identificararrays;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Resolucao {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       scan.nextLine();
       int count = 0;
       List<Integer> A = Arrays.stream(scan.nextLine().trim().split("\\s+"))
                    .map(Integer::parseInt).collect(Collectors.toList());
       for (int i = 0; i < A.size(); i++)
           {for (int j = i+1; j <= A.size(); j++)
               {if (A.subList(i, j).stream()
               .mapToInt(Integer::intValue).sum() < 0) count++;}}
       System.out.println(count);
       }
    }
