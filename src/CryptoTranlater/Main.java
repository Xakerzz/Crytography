package CryptoTranlater;

public class Main {
    public static void main(String[] args) {
        Crypto crypto = new Crypto("14.03.2021 Привет мой друг, как дела?");
        crypto.print();
        System.out.println(crypto.nonCryptoToCrypto(crypto.getInCrypto()));
        System.out.println(crypto.toString());
        NonCrypto nonCrypto = new NonCrypto(crypto.getInCrypto());
        nonCrypto.print();
        System.out.println(nonCrypto.CryptoToNonCrypto(nonCrypto.getNonCrypto()));
        System.out.println(nonCrypto.toString());
        System.out.println();

    }
}
