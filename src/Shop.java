public class Shop {
    
    public static void main(String[] args) {
        
        Smartphone iphone = new Smartphone();
        iphone.setNome("iPhone 16");
        iphone.setMarca("Apple");
        iphone.setPrezzo(879);
        iphone.setIva(1.22);
        iphone.setMemoria(128);

        System.out.println(iphone.getPrezzoIvato());

        Smartphone samsung = new Smartphone();
        samsung.setNome("Galaxy S25");
        samsung.setMarca("Samsung");
        samsung.setPrezzo(1499);
        samsung.setIva(1.22);
        samsung.setMemoria(512);

        System.out.println(samsung.getPrezzoIvato());

        Televisori sony = new Televisori();
        sony.setNome("XR65A83L");
        sony.setMarca("SONY");
        sony.setPrezzo(1998);
        sony.setIva(1.22);
        sony.setPollici(65);
        sony.setSmart(true);

        System.out.println(sony.isSmart());

        Televisori hisense = new Televisori();
        hisense.setNome("55A6N");
        hisense.setMarca("HISENSE");
        hisense.setPrezzo(398);
        hisense.setIva(1.22);
        hisense.setPollici(55);
        hisense.setSmart(false);

        System.out.println(hisense.getPrezzoIvato());

        Cuffie airpods = new Cuffie();
        airpods.setNome("AirPods 4");
        airpods.setMarca("Apple");
        airpods.setPrezzo(129.99);
        airpods.setIva(1.22);
        airpods.setColore("bianco");
        airpods.setWireless(true);

        System.out.println(airpods.isWireless());

        Cuffie buds = new Cuffie();
        airpods.setNome("Redmi Buds 6");
        airpods.setMarca("XIAOMI");
        airpods.setPrezzo(12.99);
        airpods.setIva(1.22);
        airpods.setColore("nero");
        airpods.setWireless(true);

        System.out.println(buds.isWireless());

    }
}
