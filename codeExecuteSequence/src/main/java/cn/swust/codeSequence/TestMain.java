package cn.swust.codeSequence;

//顺序为 静态代码块（父类->子类）->父类构造代码块->父类构造方法->子类构造代码块->子类构造方法->子类普通方法内容或普通代码块按序执行
public class TestMain {
    static{
        System.out.println("测试静态代码块");
    }
    {
        System.out.println("测试构造代码块");
    }
    public static void main(String[] args) {
        zi zi = new zi();
        zi.ziMethod();
    }
}
