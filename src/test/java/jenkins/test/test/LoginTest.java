/**
 * 杭州天谷信息科技有限公司源代码，版权归杭州天谷信息科技有限公司所有 <br/>
 * 项目名称：jenkinstest <br/>
 * 文件名：LoginTest.java <br/>
 * 包：jenkins.test.test <br/>
 */
package jenkins.test.test;

import junit.framework.TestCase;

/**
 * 类名：LoginTest.java <br/>
 * 中文名：TODO <br/>
 * 描述：TODO <br/>
 * 修改历史： <br/>
 * 1.[2016年1月8日下午3:26:22]创建文件 by lcc
 */
public class LoginTest extends TestCase {

    public void testL(){
        String a = new Login().L();
        assertEquals("testApp返回结果期望不同，不是b", a, "b");
    }
}
