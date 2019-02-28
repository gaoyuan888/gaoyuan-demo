package cn.gaoyuan.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws  Exception
    {
        String ss="{\n" +
                "\t\"DOCTOR_ID\": 200138203,//医生ID\n" +
                "\t\"DOCTOR_NAME\": \"赵金平\",//医生名称\n" +
                "\t\"UNIT_ID\": 100000319,//医院ID\n" +
                "\t\"UNIT_NAME\": \"接入医院测试医院\",//医院名称\n" +
                "\t\"DEP_ID\": 200067665,//科室ID\n" +
                "\t\"DEP_NAME\": \"骨科\",//科室名称\n" +
                "\t\"POSITION\": 0,//\n" +
                "\t\"DOC_SORT\": 0,//\n" +
                "\t\"IS_YUYUE\": \"1\",//\n" +
                "\t\"DOC_SPELL\": \"ZJP\",//首写字母\n" +
                "\t\"SEX\": 0,//性别(prd未指明)\n" +
                "\t\"ZCID\": 1,//职称编号\n" +
                "\t\"TREAT_LIMIT\": null,//\n" +
                "\t\"IMAGE\": \"\",//医生头像\n" +
                "\t\"EXPERT\": \"发\",//专业\n" +
                "\t\"DETAIL\": \"\",//医生简介\n" +
                "\t\"YUYUE_STATE\": false,//\n" +
                "\t\"PAY_METHOD\": 0,//\n" +
                "\t\"PAY_PASS_TIME\": 0//\n" +
                "}";



        System.out.println( ss.getBytes("UTF-8").length );
    }
}
