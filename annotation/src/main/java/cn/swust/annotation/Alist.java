package cn.swust.annotation;

public class Alist <T>{
    public T[] element;

    public T[] getElement() {
        return element;
    }

    public void setElement(T[] element) {
        this.element = element;
    }

    public Alist(T[] element) {
        this.element = element;
    }
}
