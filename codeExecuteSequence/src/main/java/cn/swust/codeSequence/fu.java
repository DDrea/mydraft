package cn.swust.codeSequence;

public class fu {
    static{
        System.out.println("父类静态代码块");
    }
    {
        System.out.println("父类构造代码块");
    }
    public fu() {
        System.out.println("父类构造方法");
    }
}
