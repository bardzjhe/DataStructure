package Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Anthony Z.
 * @Date 29/5/2022
 * @Description:
 * Set: 存储无序的、不可重复的数据 即集合
 * HashSet: Set接口的主要实现类，线程不安全，可以存储null值
 * LinkedSet: 作为HashSet的子类，遍历其内部数据时，可以按照添加的顺序遍历，对于频繁的数据遍历效率更高
 * TreeSet: 可以按照添加元素的指定属性，进行排序
 *
 * Set接口中沒有额外定义的方法
 *
 */
public class SetTest {
    public void test1(){
        Set set = new HashSet();

    }
}
