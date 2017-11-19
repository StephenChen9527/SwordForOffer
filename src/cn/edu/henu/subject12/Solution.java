package cn.edu.henu.subject12;
/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。
 * @author StephenChen9527
 *
 */
public class Solution {
    public double Power(double base, int exponent) {
          if(exponent==1 ){
			 return base;
		 }
		 if(exponent==-1){
			 return 1/base;
		 }
		 
		 if(exponent>0){
			 return Power(base,--exponent)*base;
			 
		 }else{
			 return ((Power(base,++exponent)*1/base));
		 }
  }
}
