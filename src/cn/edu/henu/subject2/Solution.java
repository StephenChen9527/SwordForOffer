package cn.edu.henu.subject2;
/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * ps:简单java方法
 * @author StephenChen9527
 *
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
    	return str.toString().replaceAll(" ", "%20");
    }
}