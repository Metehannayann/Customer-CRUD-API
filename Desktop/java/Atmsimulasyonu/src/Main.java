import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bakiye = 1000.0;
        int secim;

        do {
            System.out.println("ATM OTOMASYONU");
            System.out.println("1.Bakiye Görüntüle");
            System.out.println("2.Para Yatır");
            System.out.println("3.Para Çek");
            System.out.println("4.Çıkış");
            System.out.println("Seçiminizi Girin :");
            secim = input.nextInt();
            switch (secim){
                case 1:
                    System.out.println("Mevcut Bakiyeniz : " + bakiye + " TL");
                    break;
                case 2:
                    System.out.println("Yatırmak istediğiniz para : ");
                    double  yatirilan = input.nextDouble();
                    if (yatirilan > 0) {
                        bakiye += yatirilan;
                        System.out.println("Yeni Bakiyeniz : " + bakiye + "TL");
                    } else {
                        System.out.println("Geçersiz Mİktar..");
                    }
                case 3:
                    System.out.println("Çekmek istediğiniz para : ");
                    double cekilen = input.nextDouble();
                    if (cekilen < bakiye ){
                        bakiye -= cekilen;
                        System.out.println("Yeni Bakiyeniz : " + bakiye + "TL");
                    } else {
                        System.out.println("Geçersiz Miktar..");
                    }
                case 4:
                    System.out.println("Çıkış yapılıyor..");
                    break;
                default:
                    System.out.println("Geçersiz seçim..");



            }
        }while (secim != 4);
input.close();

        }
    
        }

