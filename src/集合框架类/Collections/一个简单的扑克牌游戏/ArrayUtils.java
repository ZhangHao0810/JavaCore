package 集合框架类.Collections.一个简单的扑克牌游戏;
/**
 * Description:这是《疯狂Java讲义》作者自己编写的工具类。
 * Copyright (C), 2001-2012, Yeeku.H.Lee
 * This program is protected by copyright laws.
 *
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ArrayUtils
{
    /**
     * 定义一个工具方法，工具方法从字符串数组中找到对应的字符串元素的位置
     * @param array 搜索的数组
     * @param target 搜索的字符串
     * @return 目标字符串出现的位置,-1表明找不到
     */
    public static int search(String[] array, String target)
    {
        for (int i = 0 ; i < array.length ; i++ )
        {
            if (array[i] != null && array[i].equals(target))
            {
                return i;
            }
        }
        return -1;
    }
}