package decorator;

public class DESEncryption extends  Encryption{
    @Override
    public String encrypt() {
        return "Encrypting using DES encryption!";
    }
}
