package proxy.staticproxy;

/**
 * @program: TestBlog
 * @description:
 * @author: vcjmhg
 * @create: 2019-10-07 16:31
 **/
public class MiShu implements GongNeng{
    private LaoZong laoZong=new LaoZong();
    public void ZuoShengYi() {
        System.out.println("秘书：请问您预约来吗？");
        laoZong.ZuoShengYi();
        System.out.println("秘书备注访客信息");
    }

    public void eat() {
        System.out.println("秘书：请问您预约来吗？");
        laoZong.eat();
        System.out.println("秘书备注访客信息");
    }
}

