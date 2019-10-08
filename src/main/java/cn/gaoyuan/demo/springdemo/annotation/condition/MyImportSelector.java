package cn.gaoyuan.demo.springdemo.annotation.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/10/1 12:54
 * @desc
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
//        annotationMetadata.get

        String[] strings = new String[0];

        return new String []{"cn.gaoyuan.demo.springdemo.annotation.bean.Blue","cn.gaoyuan.demo.springdemo.annotation.bean.Yellow"};
    }
}
