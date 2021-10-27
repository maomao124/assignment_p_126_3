/**
 * Project name(项目名称)：作业_P126_3
 * Package(包名): PACKAGE_NAME
 * Class(类名): Circle
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/27
 * Time(创建时间)： 19:14
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Circle implements CalcArea
{
    private double radius;  //半径
    private static final double PI = 3.1415926;

    public Circle(double radius)
    {
        if (radius < 0)
        {
            this.radius = 0;
        }
        else
        {
            this.radius = radius;
        }
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        if (radius >= 0)
        {
            this.radius = radius;
        }
        else
        {
            this.radius = 0;
        }
    }

    @Override
    public double getArea()
    {
        return PI * radius * radius;
    }
}
