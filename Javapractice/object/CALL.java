package object;

import java.io.*;

public class CALL {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CoinCase Okane = new CoinCase();
        for(int i=0;i<6;i++){
            System.out.print("硬貨の種類を入力してください。");
            int coin = Integer.parseInt(br.readLine());
            System.out.print("硬貨の枚数を入力してください。");
            int count = Integer.parseInt(br.readLine());
            Okane.AddCoins(coin,count);
        }
        System.out.println("500円は" + Okane.GetCount(500) +"枚");
        System.out.println("100円は" + Okane.GetCount(100) +"枚");
        System.out.println("50円は" + Okane.GetCount(50)   +"枚");
        System.out.println("10円は" + Okane.GetCount(10)   +"枚");
        System.out.println("5円は" + Okane.GetCount(5)     +"枚");
        System.out.println("1円は" + Okane.GetCount(1)     +"枚");
        System.out.println("全部で" + Okane.GetCount(1)    +"枚" + Okane.GetAmount() +"円");
    }
}
