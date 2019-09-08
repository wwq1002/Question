package 剑指offer;

public class 模式串匹配 {
    public boolean match(char[] str,char[] pattern) {
        if (str==null||pattern==null) {
            return false;
        }
        return matchRecur(str,pattern,0,0);
    }
    public boolean matchRecur(char[] str,char[] pattern,int s,int p) {
        //两个对比指针走到最后，则说明匹配成功
        if (s==str.length&&p==pattern.length) {
            return true;
        }
        //模式串比文本先到末尾肯定没匹配成功，要想匹配成功必须是的条件是：模式串的长度>=文本串
        if (p==pattern.length&&s<str.length) {
            return false;
        }
		/*现在开始正式分析
		第一个字符不相等的话，就直接返回false。return false;
		第二个字符就要分情况讨论了
			1、当模式中的第二字符不是   * 时，那就大家都往后比呗  ，文本和模式都往后移一步。
			   abc...(文本串)
			   abc...(模式串)
			   代码：(记住，由于模式串的长度>=文本，所以只要考虑文本是否越界就行)
			  if((s<str.length&&str[s]==pattern[p])||(pattern[p]=='.'&&s<str.length)) {
				  return matchRecur(str, pattern, s+1, p+1);
			  }
			2、当模式中第二个字符是 * 时，这个情况就有四种情况要考虑了
		                第一个字符不相等，例子ab和c*ab，一个a一个c，且模式串第二个* 则，直接patten向后跳两个指针：
				    return matchRecur(str, pattern, s, p+2);
			     当第一个字符相等时了？就有三种情况要考虑在内了
			       1、abc和a*bc  模式后移2字符,文本后移1个，相当于*被忽略  matchRecur(str, pattern, s+1, p + 2)
			       2、abc和a*abc 模式后移2字符，相当于x*被忽略；matchRecur(str, pattern, s, p + 2)
			       3、aaaabc和a*abc 字符串后移1字符，模式不变，即继续匹配字符下一位，因为*可以匹配多位；matchRecur(str, pattern, s+1, p)
	  */

        //用代码实现上述的逻辑流程

		/*1、当模式中的第二字符不是   * 时，那就大家都往后比呗  ，文本和模式都往后移一步。
		   abc...(文本串)
		   abc...(模式串)
		   代码：(记住，由于模式串的长度>=文本，所以只要考虑文本是否越界就行)
		  if((s<str.length&&str[s]==pattern[p])||(pattern[p]=='.'&&s<str.length)) {
			  return matchRecur(str, pattern, s+1, p+1);
		  } */
        if ((s<str.length&&str[s]==pattern[p])||(s<str.length&&pattern[p]=='.')) {
            return matchRecur(str, pattern, s+1, p+1);
        }

		/*2、当模式中第二个字符是 * 时，这个情况就有四种情况要考虑了
		（1）例子ab和c*ab
		  第一个字符不相等，一个a一个c，且模式串第二个* 则，直接patten向后跳两个指针：
		    return matchRecur(str, pattern, s, p+2);
	     当第一个字符相等时了？就有三种情况要考虑在内了
	       1、abc和a*bc  模式后移2字符,文本后移1个，相当于*被忽略  matchRecur(str, pattern, s+1, p + 2)
	       2、abc和a*abc 模式后移2字符，相当于x*被忽略；matchRecur(str, pattern, s, p + 2)
	       3、aaaabc和a*abc 字符串后移1字符，模式不变，即继续匹配字符下一位，因为*可以匹配多位；matchRecur(str, pattern, s+1, p)*/

        if (p<pattern.length-1&&pattern[p+1]=='*') {
            if ((s<str.length&&str[s]==pattern[p])||(s<str.length&&pattern[p]=='.')) {
                //下面或最后结果只有有个为真，就行，因为它必走下面三个条件
                return matchRecur(str, pattern, s+1, p + 2)||
                        matchRecur(str, pattern, s, p + 2)||
                        matchRecur(str, pattern, s+1, p);

            }else {
                return matchRecur(str, pattern, s, p+2);

            }
        }



        return false;


    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
