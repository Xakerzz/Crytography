package CryptoTranlater;

public class Crypto implements PrintCryptoAndNonCrypto{
     private String inCrypto;

    public Crypto(String inCrypto) {
        this.inCrypto = inCrypto;
    }

    public Crypto() {
    }


    public String getInCrypto() {
        return inCrypto;
    }

    public void setInCrypto(String inCrypto) {
        this.inCrypto = inCrypto;
    }

    @Override
    public void print() {
        System.out.println(this.getInCrypto());
    }

    public  StringBuilder nonCryptoToCrypto(String nC){
        StringBuilder arrayLength = new StringBuilder();
        arrayLength.append(nC);
        char[] charArray = new char[arrayLength.length()];

        for (int i = 0; i < arrayLength.length(); i++) {
            charArray[i] = nC.charAt(i);
        }
        StringBuilder nonCr = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            char str = charArray[i];
            int code = (int) str+40*3*2;
            str = (char) code;
            nonCr.append(str);
        }
        String str = nonCr.toString();
        this.inCrypto = str;
        return nonCr;
    }

    @Override
    public String toString() {
        return "Your massage  with CRyPTO: " + inCrypto;
    }
}
