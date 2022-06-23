package abstractClasses;

//BusTicketPriceManager'ı Base class olarak kabul ettim ve metotları burada kullanabilmek için extends ettim
//yani miras aldım. Abstractlar da bir class olduğu için extends edilir.
public class StudentTicketPriceManager extends BusTicketPriceManager{


    //Bu sefer de abstract metotumu öğrenciler için Override ederek öğrenciler için
    //bilet fiyatını 1.5$ olarak belirttim.
    @Override
    public void getTicketPrice() {
        System.out.println("Student ticket price is : 1.5$ ");
    }
}
