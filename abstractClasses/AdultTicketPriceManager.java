package abstractClasses;


//BusTicketPriceManager'ı Base class olarak kabul ettim ve metotları burada kullanabilmek için extends ettim
//yani miras aldım. Abstractlar da bir class olduğu için extends edilir.
public class AdultTicketPriceManager extends BusTicketPriceManager{



    //Bu sefer ise metotumu yetişkinler için Override ederek yetişkinler için bilet
    //fiyatını 3$ olarak belirledim.
    @Override
    public void getTicketPrice() {
        System.out.println("Adult ticket price is : 3$ ");
    }
}
