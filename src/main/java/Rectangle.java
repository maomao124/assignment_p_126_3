/**
 * Project name(项目名称)：作业_P126_3
 * Package(包名): PACKAGE_NAME
 * Class(类名): Rectangle
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/27
 * Time(创建时间)： 19:14
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Rectangle implements CalcArea
{
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        if (length >= 0)
        {
            this.length = length;
        }
        else
        {
            this.length = 0;
        }
        if (width >= 0)
        {
            this.width = width;
        }
        else
        {
            this.width = 0;
        }
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        if (length >= 0)
        {
            this.length = length;
        }
        else
        {
            this.length = 0;
        }
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        if (width >= 0)
        {
            this.width = width;
        }
        else
        {
            this.width = 0;
        }
    }

    @Override
    public double getArea()
    {
        return length * width;
    }
}
