package cn.gaoyuan.demo.algorithm.hashdemo;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/4/26 20:51
 * @desc
 */
public class HashTable {
    private StudentInfo[] data = new StudentInfo[100];

    /**
     * 向散列表中添加一个元素
     *
     * @param info
     */
    public void put(StudentInfo info) {
        //调用散列函数获取存储位置
        int index = info.hashCode();
        data[index] = info;
    }

    public StudentInfo get(StudentInfo info) {
        return data[info.hashCode()];
    }
}
