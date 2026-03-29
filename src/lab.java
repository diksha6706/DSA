class Box <T> {
    T data;
    void setData(T data){
        this.data = data;

    }
    T getData(){
        return data;
    }
}
public class lab{
    public static void main(String[] args) {
        Box<Integer>intBox = new Box<Integer>();
        intBox.setData(100);
        System.out.println("Integer Value: " + intBox.getData());
        Box<String>strBox = new Box<String>();
        strBox.setData("Hello Generics");
        System.out.println("String Value: " + strBox.getData());
    }
}
