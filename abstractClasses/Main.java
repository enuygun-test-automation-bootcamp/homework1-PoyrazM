package abstractClasses;


//Burası benim Main sınıfım , ben burada operasyonlarımın sonuçlarını görmek istiyorum.
public class Main {

    public static void main(String[] args) {

    /*
    Main metotumda ben oluşturduğum classlarımı çağırıp , o classlara yazdığım metotlardaki operasyonları takip
    etmek istiyorum. Normalde Class ismini stringe tanımlayarak = newleme işlemi yaparım.
    Ama ben sürecimi Base classtan yönetmek istediğim için

    Abstract olan classımı newlemem gerekir fakat abstract classlar newlenemez
    (Çünkü Base Class'ımı abstract tanımladım).

    Ben abstract classımı çağırıp ona bağladığım (inherit için-extends) classları newleyebilirim
    o classlardaki bilgileri almak için.

    Yani şu kullanım yanlıştır
    BusTicketManager busTicketManager = new BusTicketManager();
    */


        BusTicketPriceManager busTicketPriceManager = new StudentTicketPriceManager();
        busTicketPriceManager.getTicketPrice();
        busTicketPriceManager.holidayPrice();

    /*
    Doğru çağırma şeklim buradaki gibidir. Burada öğrenciler için bilet fiyatı almak istedim
    Dedim ki sevgili BusTicketPriceManager abstract canım sınıfım , ben sana bağladığım
    StudentTicketPriceManager sınıfımdaki bilet fiyatlarını görmek istiyorum
    bana hem onu hem de , hiçbir sınıfta değiştiremeyeceğim , senin içinde(BusTicketPriceManager)
    public final void bir metot oluşturmuştum ama sana bağlı olan hiçkimsecikler bu metotun üzerine
    yazıp ezemesin. Heh o var ya bana onu getir yani bayram tatillerindeki bilet fiyatını.
    */


        BusTicketPriceManager busTicketPriceManager1 = new AdultTicketPriceManager();
        busTicketPriceManager1.getTicketPrice();
        busTicketPriceManager1.holidayPrice();


    /*
    Burada ise yetişkinler için bilet fiyatlarını görmek istedim ve bu sefer BusTicketPriceManager abstract
    sınıfıma dedim ki :
    "Ya abi ben öğrenci fiyatlarını aldım senden ama yetişkinler için de sana AdultTicketPriceManager bağlamıştım
    yani extends etmiştim. Sana zahmet bana onları da getirsene. Bir de bayram tatillerindeki fiyat meselesi vardı
    biliyorsun  :)"
    */


        BusTicketPriceManager busTicketPriceManager2 = new OlderTicketPriceManager();
        busTicketPriceManager2.getTicketPrice();
        busTicketPriceManager2.holidayPrice();

    /*
     Burada da dedim ki kusura bakma BusTicketPriceManager seni yoruyorum ama son isteğim var senden
     Tamam ben sana tanımladığım 2 sınıfımdan metotları çağırdım ama ben sana bir de yaşlı insanlar için
     OlderTicketPriceManager bağlamıştım. Bana onun fiyatını da getirsene , bir de herkeste aynı olan
     final void olarak tanımladığım için hiçbir sınıfında değiştiremediğim bayram tatilleri fiyatını
    */

    }
}