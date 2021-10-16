package CryptoTranslater;

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
    }// Переопределяем метод из интерфейса.

    public  StringBuilder nonCryptoToCrypto(String nC){ // Создаём метод который принимает строку, и возвращает тоже строку.
        StringBuilder arrayLength = new StringBuilder(); // Создаём StringBuilder ,для определения длины строки.
        arrayLength.append(nC);
        char[] charArray = new char[arrayLength.length()]; // Объявляем массив равный длине строки.

        for (int i = 0; i < arrayLength.length(); i++) { // Иницилизируем массив элементами.
            charArray[i] = nC.charAt(i);
        }
        StringBuilder nonCr = new StringBuilder(); // Создаем еще один StringBuilder для формирования шифровонной строки.

        for (int i = 0; i < charArray.length; i++) {
            char str = charArray[i]; // Присваем элемент из массива в char переменную.
            int code = (int) str+40*3*2; // Приводим char к int.(Так как char относится к UniCode)
            str = (char) code; // Присваиваем к char номер символа UniCode.
            nonCr.append(str);
        }
        String str = nonCr.toString(); // Для возврата StringBuilder приводим к String.
        this.inCrypto = str; // Присваиваем значение полю класса.
        return nonCr; // Возвращаем полученный результат.
    }

    @Override
    public String toString() {
        return "Your massage  with CRyPTO: " + inCrypto;
    } // Переопределяем метод toString().
}
