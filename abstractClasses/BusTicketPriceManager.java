package abstractClasses;

/*Burada public ve class arasına abstract yazarak classımın soyut bir class yani abstract bir class olduğunu belirttim.
 ve bu classın benim artık Base classım olmasını istiyorum.*/
public abstract class BusTicketPriceManager {


    /*
    Metodumu abstract void tanımlayarak ; bilet fiyatları bazı yaş gruplarında değişken olduğu için ,
    ilgili yaş grupları için farklı classlar açıp o classlar içinde Override ederek
    fiyatları o classlar içerisinde belirlemek istedim. Ve abstract metot oluşturduğum için {} süslü
    parantezlerini kullanarak body oluşturmadım.
    */
    public abstract void getTicketPrice();




    /*
    Metoduma final ekleyerek değiştirelemez olduğunu dile getirdim. Yani başka bir classta
    Override edip fiyatları değiştiremezsin. Örneğin bayram tatilleri için herkese ücretsiz
    fiyat tanımladım Base'mde ve bunu diğer classlarda değiştiremem , yani Override edemem
    (Üzerine yazıp bu metotu ezemem).
    */
    public final void holidayPrice(){
        System.out.println("Holiday price is : 0$ , Happy Holidays!");
        //System.out.println("Konsolda yazdırmak istediğim yazı")
    }
}
