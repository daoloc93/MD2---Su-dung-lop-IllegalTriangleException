public class IllegalTriangleException extends Exception{

    public IllegalTriangleException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập vào độ dài cạnh: " + super.getMessage();
    }
}
