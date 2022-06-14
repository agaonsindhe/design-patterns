package decorator;

public class DecoratorPatternRunner {

    public static void main(String[] args) {
        Encryption encryptValue = new AESEncryption();
        System.out.println(encryptValue.encrypt());

        Encryption encryptValue2 = new DESEncryption();

        encryptValue2 = new AESDESEncryption(encryptValue2);
        System.out.println(encryptValue2.encrypt());

        Encryption encryption3 = new AESEncryption();

        encryption3 = new DESAESEncryption(encryption3);
        System.out.println(encryption3.encrypt());



    }





}
