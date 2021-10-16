package CryptoTranlater;

public class NonCrypto implements PrintCryptoAndNonCrypto {
    private String nonCrypto;

    public NonCrypto(String nonCrypto) {
        this.nonCrypto = nonCrypto;
    }

    public NonCrypto() {
    }

    public String getNonCrypto() {
        return nonCrypto;
    }

    public void setNonCrypto(String nonCrypto) {
        this.nonCrypto = nonCrypto;
    }

    @Override
    public void print() {
        System.out.println(this.getNonCrypto());
    }

    public StringBuilder CryptoToNonCrypto(String nC){
        StringBuilder arrayLength = new StringBuilder();
        arrayLength.append(nC);
        char[] charArray = new char[arrayLength.length()];

        for (int i = 0; i < arrayLength.length(); i++) {
           charArray[i] = nC.charAt(i);
        }
        StringBuilder nonCr = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            char str = charArray[i];
            int code = (int) str-40*3*2;
            str = (char) code;
            nonCr.append(str);
        }
        String str = nonCr.toString();
        this.nonCrypto = str;
        return nonCr;
    }

    @Override
    public String toString() {
        return "Your massage  without CRyPTO: " + nonCrypto;
    }
}
