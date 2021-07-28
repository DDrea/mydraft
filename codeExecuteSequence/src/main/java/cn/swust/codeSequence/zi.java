package cn.swust.codeSequence;

public class zi extends fu {
    static{
        System.out.println("子类静态代码块");
    }
    {
        System.out.println("子类构造代码块");
    }
    public zi() {
        System.out.println("子类构造方法");
    }
    public void ziMethod(){
        System.out.println("子类普通方法第一步");
        {
            System.out.println("子类普通代码块第二部");
        }
        System.out.println("子类普通方法第三步");
    }
}
