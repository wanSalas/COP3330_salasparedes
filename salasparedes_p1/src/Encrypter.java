import java.util.Arrays;

public class Encrypter {
    public void encrypt(String fourNumbers)
    {
        holdNumbers(fourNumbers);
    }
    public String holdNumbers(String fourNumber)
    {
        String temp = fourNumber;
        int value = Integer.valueOf(temp);
        String Encrypt = null;
        int i, j, k, l;
        int numbArray[] = new int[4];

        if (value < 0 || value > 9999)
        {
            System.out.println("PLEASE TRY AGAIN");
        }else
        {
            i = value / 1000;
            j = value / 100 % 10;
            k = value / 10 % 10;
            l = value % 10;

            i = (i + 7)%10;
            j = (j + 7)%10;
            k = (k + 7)%10;
            l = (l + 7)%10;
            numbArray[0] = k;
            numbArray[1] = l;
            numbArray[2] = i;
            numbArray[3] =j ;
            Encrypt = Arrays.toString(numbArray);
            Encrypt = Encrypt.replace("[", "");Encrypt = Encrypt.replace(" ", "");
            Encrypt = Encrypt.replace(",", "");
            Encrypt = Encrypt.replace("]", "");
            System.out.println(Encrypt);
        }
        return Encrypt;
    }
}
