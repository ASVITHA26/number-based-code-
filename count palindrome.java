import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String st1 = obj.nextLine();//world,level,class,madam
        String wd[]= st1.split(",");//world level class madam
   //                                      0    1     2    3
        int c = 0;

        for (int i=0;i<wd.length;i++) {
            
            String word = wd[i].toLowerCase();//world
            int s = 0, e = word.length()- 1;
            int flag =0;

            while (s < e) //class
            {
                if (word.charAt(s) != word.charAt(e)) {
                    flag =1;
                    break;
                }
                s++;
                e--;
            }

            if (flag==0) 
                c++;
        }

        System.out.println(c);
    }
}
