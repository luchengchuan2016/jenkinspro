/**
 * 杭州天谷信息科技有限公司源代码，版权归杭州天谷信息科技有限公司所有 <br/>
 * 项目名称：test <br/>
 * 文件名：AppTest.java <br/>
 * 包：jenkins.test.test <br/>
 */
package com.test.abc;

import com.test.abc.App;

import junit.framework.TestCase;

/**
 * 类名：AppTest.java <br/>
 * 中文名：TODO <br/>
 * 描述：TODO <br/>
 * 修改历史： <br/>
 * 1.[2016年1月8日上午9:31:57]创建文件 by lcc
 */
public class AppTest extends TestCase {

    public void testApp(){
        String a = new App().print("a");
        assertEquals("testApp返回结果期望不同，不是a", a, "a");
    }
}
