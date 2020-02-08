package cn.gaoyuan.demo;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/11/26 15:29
 * @desc
 */
public class Test123 {

    public static void main(String[] args) {
        AA aa=new AA();
        aa.setAa(1);

        CC cc=new CC();
        List<AA> aas=new ArrayList<>();
        aas.add(aa);
        cc.setBbList(aas);

        DD dd=new DD();
        BeanUtils.copyProperties(cc,dd);

        System.out.println(dd);

    }
}

class DD{
    List<BB> bbList;

    public List<BB> getBbList() {
        return bbList;
    }

    public void setBbList(List<BB> bbList) {
        this.bbList = bbList;
    }
}

class CC{
    List<AA> bbList;

    public List<AA> getBbList() {
        return bbList;
    }

    public void setBbList(List<AA> bbList) {
        this.bbList = bbList;
    }
}


class AA{
    Integer aa;

    public Integer getAa() {
        return aa;
    }

    public void setAa(Integer aa) {
        this.aa = aa;
    }
}


class BB{
    Integer aa;

    public Integer getAa() {
        return aa;
    }

    public void setAa(Integer aa) {
        this.aa = aa;
    }
}