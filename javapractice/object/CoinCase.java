package object;

public class CoinCase {
//    硬貨の枚数を決める
    public int Yen500 = 0;
    public int Yen100 = 0;
    public int Yen50 = 0;
    public int Yen10 = 0;
    public int Yen5 = 0;
    public int Yen1 = 0;

//各メソッドを生成
    public void AddCoins(int coin, int count){
        switch(coin){
            case 500 : Yen500 += count;
            break;
            case 100 : Yen100 += count;
            break;
            case 50  : Yen50 += count;
            break;
            case 10  : Yen10 += count;
            break;
            case 5   : Yen5 += count;
            break;
            case 1   : Yen1 += count;
            break;
        }
    }
    public int GetCount(int coin){
        switch(coin){
            case 500 : return Yen500;
            case 100 : return Yen100;
            case 50  : return Yen50;
            case 10  : return Yen10;
            case 5   : return Yen5;
            case 1   : return Yen1;
        }
        return 0;
    }

    public int GetAmount(){
        return(Yen500*500)+(Yen100*100)+
                (Yen50*50)+(Yen10*10)+
                (Yen5*5);
    }

}
