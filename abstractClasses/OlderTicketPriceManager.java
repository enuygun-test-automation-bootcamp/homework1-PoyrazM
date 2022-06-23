package abstractClasses;

/*BusTicketPriceManager'ı Base class olarak kabul ettim ve metotları burada kullanabilmek için extends ettim
yani miras aldım. Abstractlar da bir class olduğu için extends edilir.*/
public class OlderTicketPriceManager extends BusTicketPriceManager{


    //Abstract bir metot olarak tanımladığım için bilet fiyatlarını gösterme durumunu ,
    //yaşlılar classı yani bu class için Override işlemi yaparak yaşlılar için bilet fiyatının
    //ücretsiz olduğunu tanımladım.
    @Override
    public void getTicketPrice() {
        System.out.println("We respect old people , tickets are free for the older people : 0$ ");
    }
}
