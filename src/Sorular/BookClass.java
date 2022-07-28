package Sorular;

public class BookClass {

    String adi = "Bilinmiyor";
    String yazari = "Bilinmiyor";
    int yayinYili;
    // class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
    //2  ve 3 pm li const olusturun
    //main method bu class da olsun
    //main method icinde obj leri create edin iki const tu da kullanin
    //yazdir isimli method create edin
    //ve bu methodlar olusturdugunuz obj leri yazdirin

    public BookClass(String adi, String yazari, int yayinYili) {
        this.adi = adi;
        this.yazari = yazari;
        this.yayinYili = yayinYili;
    }

    public BookClass() {

    }

    public BookClass(String adi, int yayinYili) {
        this.adi = adi;
        this.yayinYili = yayinYili;
    }

    @Override
    public String toString() {
        return
                "\nadi = " + adi +
                "\nyazari = " + yazari +
                "\nyayinYili = " + yayinYili;
    }
}