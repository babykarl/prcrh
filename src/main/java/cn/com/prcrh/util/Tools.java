
package cn.com.prcrh.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.UUID;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月14日 上午10:23:01
* 类说明
*/

public class Tools {
    /**
     * 功能：获取UUID去除“-”转小写
     * 
     * @return 返回UUID
     */
    public static String getUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("-", "").toUpperCase();
    }
    
    public static Date getDate() {
    	LocalDate localDate = LocalDate.now();
    	ZoneId zone = ZoneId.systemDefault();
    	Instant instant = localDate.atStartOfDay().atZone(zone).toInstant();
    	java.util.Date date = Date.from(instant);
        return date;
    }

}


