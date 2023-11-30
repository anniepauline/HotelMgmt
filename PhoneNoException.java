public class PhoneNoException extends Exception {
    public PhoneNoException(String str) {
        super(str);
    }

    // or
    // @Override
    // public String getMessage() {
    // return "PhoneNumberLimitException";
    // }

}
