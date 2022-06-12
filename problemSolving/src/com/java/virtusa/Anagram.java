import java.util.Arrays;
import java.util.Scanner;
 
public class ana {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        if(s1.length()==s2.length())
        {
            char temp1[] = s1.toCharArray();
            char temp2[] = s2.toCharArray();
            Arrays.sort(temp1);
            Arrays.sort(temp2);
            for(int i=0;i<s1.length();i++)
            {
                if(temp1[i] != temp2[i])
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.print("amagram");
            else
                System.out.print("not amagram");
        }
        else
            System.out.print("not amagram");
    }
}
