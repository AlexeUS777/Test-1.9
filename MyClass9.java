import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class MyClass9 {
    public static void main(String[] args) throws IOException {

        //1.Пользователь вводит три строки, выведите их в обратном порядке.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter three words:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        StringBuilder sb3 = new StringBuilder(str3);
        sb1.reverse();
        sb2.reverse();
        sb3.reverse();
        String reversedStr1 = sb1.toString();
        String reversedStr2 = sb2.toString();
        String reversedStr3 = sb3.toString();

        System.out.println(reversedStr1 + " " + reversedStr2 + " " + reversedStr3);

        //2.Используя System.in (без сканнера), считайте слово из 5 букв.
        System.out.print("Please enter a 5 letter word:");

        char q1 = (char)System.in.read();
        char q2 = (char)System.in.read();
        char q3 = (char)System.in.read();
        char q4 = (char)System.in.read();
        char q5 = (char)System.in.read();

        String q = new String(new char[]{q1, q2, q3, q4, q5});

        System.out.println(q);

        //3.Используя System.in (без сканнера),считайте слово до пробела. Макс размер слова 10 символов.
        System.out.print("Please enter a 10 letter word:");

        char w1 = (char)System.in.read();
        char w2 = (char)System.in.read();
        char w3 = (char)System.in.read();
        char w4 = (char)System.in.read();
        char w5 = (char)System.in.read();
        char w6 = (char)System.in.read();
        char w7 = (char)System.in.read();
        char w8 = (char)System.in.read();
        char w9 = (char)System.in.read();
        char w10 = (char)System.in.read();

        String w = new String(new char[]{w1, w2, w3, w4, w5, w6, w7, w8, w9, w10});
        char space = ' ';
        System.out.println((w.indexOf(space) != -1) ? w.substring(0, w.indexOf(space)) : w);

        //4.Используя Scanner на основе FileInputStream, прочесть из файла строку: название другого файла.
        // Из этого другого файла прочесть название третьего файла, и в третий файл записать букву,
        // которую пользователь введет через System.in (без сканера).
        InputStream stream = new FileInputStream("File1.txt");
        InputStream stream1 = new FileInputStream("File2.txt");
        Scanner scan = new Scanner(stream);
        Scanner scan1 = new Scanner(stream1);
        String ss1 = scan.nextLine();
        String ss2 = scan1.nextLine();

        System.out.println(ss1);
        System.out.println(ss2);

        System.out.print("Please enter your a letter:");

        PrintWriter writer = new PrintWriter("File3.txt");
        char e = (char)System.in.read();
        writer.println(e);

        writer.close();

        //5.Пользователь вводит 7символов. Используя System.in (без сканнера), считайте целое число до первой нецифры.
        // (пример: «35 руб», ответ 35.) считаем, что первым пользователь всегда вводит цифру.
        System.out.print("Please enter 10 characters:");

        char r1 = (char)System.in.read();
        char r2 = (char)System.in.read();
        char r3 = (char)System.in.read();
        char r4 = (char)System.in.read();
        char r5 = (char)System.in.read();
        char r6 = (char)System.in.read();
        char r7 = (char)System.in.read();

        String r = new String(new char[]{r1, r2, r3, r4, r5, r6, r7});

        String rR = r.replaceAll("\\D+", " ");
        System.out.println(rR);
        //решил сделать таким способом, много про него прочитал информации, можете, пожалуйста, и Вы подробнее про
        //эту конструкцию написать и разъяснить: String rR = r.replaceAll("\\D+", " ");

        //6.Аналогично предыдущей задаче, но пользователь всегда вводит дробное число (пример ввода: «3.5 кг»).
        System.out.print("Please enter 10 characters:");

        char t1 = (char)System.in.read();
        char t2 = (char)System.in.read();
        char t3 = (char)System.in.read();
        char t4 = (char)System.in.read();
        char t5 = (char)System.in.read();
        char t6 = (char)System.in.read();
        char t7 = (char)System.in.read();

        String t = new String(new char[]{t1, t2, t3, t4, t5, t6, t7});
        String tT = t.replaceAll("\\D+", " ");
        System.out.println(t);

        //7.Пользователь вводит 10 строк. Те из них, в которых есть восклицательный знак, выведите в stderr.
        // Попробуйте использовать цикл.

        System.out.print("Please enter 10 words:");
        String y1 = scanner.nextLine();
        String y2 = scanner.nextLine();
        String y3 = scanner.nextLine();
        String y4 = scanner.nextLine();
        String y5 = scanner.nextLine();
        String y6 = scanner.nextLine();
        String y7 = scanner.nextLine();
        String y8 = scanner.nextLine();
        String y9 = scanner.nextLine();
        String y10 = scanner.nextLine();

        char symb1 = '!';

        if(y1.contains(String.valueOf(symb1))){
            System.err.println(y1);
        } else{
            System.out.println(y1);

        }
        if(y2.contains(String.valueOf(symb1))){
            System.err.println(y2);
        } else{
            System.out.println(y2);

        }
        if(y3.contains(String.valueOf(symb1))){
            System.err.println(y3);
        } else{
            System.out.println(y3);

        }
        if(y4.contains(String.valueOf(symb1))){
            System.err.println(y4);
        } else{
            System.out.println(y4);

        }
        if(y5.contains(String.valueOf(symb1))){
            System.err.println(y5);
        } else{
            System.out.println(y5);

        }
        if(y6.contains(String.valueOf(symb1))){
            System.err.println(y6);
        } else{
            System.out.println(y6);

        }
        if(y7.contains(String.valueOf(symb1))){
            System.err.println(y7);
        } else{
            System.out.println(y7);

        }
        if(y8.contains(String.valueOf(symb1))){
            System.err.println(y8);
        } else{
            System.out.println(y8);

        }
        if(y9.contains(String.valueOf(symb1))){
            System.err.println(y9);
        } else{
            System.out.println(y9);

        }
        if(y10.contains(String.valueOf(symb1))){
            System.err.println(y10);
        } else{
            System.out.println(y10);

        }
        //Можете, пожалуйста, объяснить подробнее про valueOf

        //8.Пользователь вводит 10 строк, потом число max. Вывести в stdout те строки, длинна которых меньше max,
        // а в stderr те, длинна которых больше, обрезав по max.
        System.out.print("Please enter 10 words:");
        String u1 = scanner.nextLine();
        String u2 = scanner.nextLine();
        String u3 = scanner.nextLine();
        String u4 = scanner.nextLine();
        String u5 = scanner.nextLine();
        String u6 = scanner.nextLine();
        String u7 = scanner.nextLine();
        String u8 = scanner.nextLine();
        String u9 = scanner.nextLine();
        String u10 = scanner.nextLine();

        System.out.print("Please enter number:");
        int max = scanner.nextInt();

        int uL1 = u1.length();
        int uL2 = u2.length();
        int uL3 = u3.length();
        int uL4 = u4.length();
        int uL5 = u5.length();
        int uL6 = u6.length();
        int uL7 = u7.length();
        int uL8 = u8.length();
        int uL9 = u9.length();
        int uL10 = u10.length();

        if(uL1 < max){
            System.out.println(u1);
        } else{
            System.err.println(u1.substring(0, max));
        }
        if(uL2 < max){
            System.out.println(u2);
        } else{
            System.err.println(u2.substring(0, max));
        }
        if(uL3 < max){
            System.out.println(u3);
        } else{
            System.err.println(u3.substring(0, max));
        }
        if(uL4 < max){
            System.out.println(u4);
        } else{
            System.err.println(u4.substring(0, max));
        }
        if(uL5 < max){
            System.out.println(u5);
        } else{
            System.err.println(u5.substring(0, max));
        }
        if(uL6 < max){
            System.out.println(u6);
        } else{
            System.err.println(u6.substring(0, max));
        }
        if(uL7 < max){
            System.out.println(u7);
        } else{
            System.err.println(u7.substring(0, max));
        }
        if(uL8 < max){
            System.out.println(u8);
        } else{
            System.err.println(u8.substring(0, max));
        }
        if(uL9 < max){
            System.out.println(u9);
        } else{
            System.err.println(u9.substring(0, max));
        }
        if(uL10 < max){
            System.out.println(u10);
        } else{
            System.err.println(u10.substring(0, max));
        }



    }
}
