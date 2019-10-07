package proxy.dynamic_jdk;

/**
 * @program: TestBlog
 * @description:
 * @author: vcjmhg
 * @create: 2019-10-07 16:49
 **/
public class LaoZong implements GongNeng{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void ZuoShengYi() {
        System.out.println("老总：谈生意");
    }

    public void eat() {
        System.out.println("老总：吃饭！！");
    }
}

