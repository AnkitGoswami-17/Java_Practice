package oops01;

public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;


    public ApiResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }


    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "\n Success : " + success + "\n Message : " + message +"\n Data : " + data;
    }

 }
