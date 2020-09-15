import java.util.Arrays;

public class Decrypter {
        public void decrypt(String fourNumbers)
        {
            unscramble(fourNumbers);

        }
        public String unscramble(String fourNumber){
            String temp2 = fourNumber;
            int value = Integer.valueOf(temp2);
            String decrypt = null;
            int i, j, k, l;
            int numbArray[] = new int[4];

            if (value < 0 || value > 9999){
                System.out.println("PLEASE TRY AGAIN");
            }else{
                i = value / 1000;
                j = value / 100 % 10;
                k = value / 10 % 10;
                l = value % 10;
                i = (i + 3)%10;
                j = (j + 3)%10;
                k = (k + 3)%10;
                l = (l + 3)%10;
                numbArray[0] = k;
                numbArray[1] = l;
                numbArray[2] = i;
                numbArray[3] = j;
                decrypt = Arrays.toString(numbArray);
                decrypt = decrypt.replace("[", "");
                decrypt = decrypt.replace(" ", "");
                decrypt = decrypt.replace(",", "");
                decrypt = decrypt.replace("]", "");
                System.out.println(decrypt);
            }
            return decrypt;
        }
    }
