package CryptoTranslater;

public class Main {
    public static void main(String[] args) { // Создаем два обьекта ,по одному для каждого из классов. Делаем вывод разными способами.
        Crypto crypto = new Crypto("14.03.2021 Привет мой друг, как дела?");
        crypto.print();
        System.out.println(crypto.nonCryptoToCrypto(crypto.getInCrypto()));
        System.out.println(crypto.toString());
        System.out.println(crypto);
        NonCrypto nonCrypto = new NonCrypto(crypto.getInCrypto());
        nonCrypto.print();
        System.out.println(nonCrypto.CryptoToNonCrypto(nonCrypto.getNonCrypto()));
        System.out.println(nonCrypto.toString());
        System.out.println(nonCrypto);



    }
}
