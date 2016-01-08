/**
 * 杭州天谷信息科技有限公司源代码，版权归杭州天谷信息科技有限公司所有 <br/>
 * 项目名称：opencahub <br/>
 * 文件名：Idesacdf.java <br/>
 * 包：cn.tsgin.www.openca.util <br/>
 */
package com.test.abc;

import java.util.Calendar;

/**
 * 类名：Idesacdf.java <br/>
 * 中文名：TODO <br/>
 * 描述：TODO <br/>
 * 修改历史： <br/>
 * 1.[2016年1月8日下午4:00:49]创建文件 by lcc
 */
public class Idesacdf {

    /**
     * 随机出生日期
     * @return
     */
    public String randomBirthday() {
        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.YEAR, (int) (Math.random() * 60) + 1950);
        birthday.set(Calendar.MONTH, (int) (Math.random() * 12));
        birthday.set(Calendar.DATE, (int) (Math.random() * 31));

        StringBuilder builder = new StringBuilder();
        builder.append(birthday.get(Calendar.YEAR));
        long month = birthday.get(Calendar.MONTH) + 1;
        if (month < 10) {
            builder.append("0");
        }
        builder.append(month);
        long date = birthday.get(Calendar.DATE);
        if (date < 10) {
            builder.append("0");
        }
        builder.append(date);
        return builder.toString();
    }
}
