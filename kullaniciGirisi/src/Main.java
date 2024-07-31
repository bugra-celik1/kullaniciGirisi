import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
String userName,password,select;
Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz:");
        userName = inp.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password = inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız..");
        }else {
            System.out.println("Hatalı şifre girdiniz..");
            System.out.print("Şifrenizi yenilemek istermisiniz?(e/h):");
            select = inp.nextLine();
            if(select.equals("e")){
                System.out.print("Yeni şifre giriniz:");
                password = inp.nextLine();
                if(password.equals("java123")){
                    System.out.println("Şifreniz eski şifre ile aynı olamaz!Tekrar deneyin");
                    System.out.print("Yeni şifre :");
                    password = inp.nextLine();
                    if(!(password.equals("java123"))){
                        System.out.println("Şifre oluşturuldu...");
                    }
                }

            }

        }
    }
}