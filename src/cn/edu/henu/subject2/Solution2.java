package cn.edu.henu.subject2;
/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * ps:普通做法
 * @author StephenChen9527
 *
 */
public class Solution2 {
    public String replaceSpace(StringBuffer str) {
    	char[] chars=str.toString().toCharArray();
    	StringBuilder sb=new StringBuilder();
    	for (char c : chars) {
			if(c==' '){
				sb.append("%20");
			}else{
				sb.append(c);
			}
		}
    	return sb.toString();
    }
}