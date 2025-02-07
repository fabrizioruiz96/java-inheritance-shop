public class Shop {

    public static void main(String[] args) {

        Smartphone iphone = new Smartphone("iPhone 16", "Apple", 879.99, 1.22, 128);

        System.out.println(iphone.toString());

        Smartphone samsung = new Smartphone("Galaxy S25", "Samsung", 1499, 1.22, 512);

        System.out.println(samsung.toString());

        Televisori sony = new Televisori("XR65A83L", "SONY", 1998, 1.22, 65, true);

        System.out.println(sony.toString());

        Televisori hisense = new Televisori("55A6N", "HISENSE", 398, 1.22, 55, false);

        System.out.println(hisense.toString());

        Cuffie airpods = new Cuffie("AirPods 4", "Apple", 129.99, 1.22, "bianco", true);

        System.out.println(airpods.toString());

        Cuffie buds = new Cuffie("Redmi Buds 6", "XIAOMI", 12.99, 1.22, "nero", true);

        System.out.println(buds.toString());

    }
}
