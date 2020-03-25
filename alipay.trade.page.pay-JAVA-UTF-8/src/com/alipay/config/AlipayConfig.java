package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2019080366058771";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCG9RG/JeVFjuObQ+jiKQqWLubUmIMXLYOihw6y+ORi3x4/2ajFUba/BVgvOMJTJZl0J9WljkA26xYpdetCrXHSGNzEmpyyiJ15rJIZdxv3/UQk0VSkYl2w1t94sx0c3SAykDA1s4G1dNkk246blG2fcpoz6420izFi2XgPf6bkfkgo5wmEGFgQhmzvBQfayPCkoG6dR4bgj1FVwO9guGT4jny66B1KHDGalZbW21oRKHpHaHYR62T7gxPYtO1Y/4eW5Nf4BuddGTJS4FePPLnckf+loX76IUjSMpUAsZqwb9bsVEd+lXHvnnCuHnfVTUL4RkJ6TNJbq4cn+unBS8yrAgMBAAECggEAfjfDsj8R730U18iqjKIPuagB0MEWkV3K5/1iPPZUOzgrBVJe6rRissKf2AJAlBztKNp8kQq6eeJh5sLXFZQ7iGAiUWm8tajZhstkFJb2PHfM/JYekGNC9rnvZOY3iyAwFboOrJrG69ttnnANLuqhn+dB2t8pt7oapTV4eR5NCxLFfgcLOrT6XAimtkMihvrX49q9gtIf78/5s1K7C+KxWbYp1Y74afp6J3bYOGBbX0QiuYSmFS1VEd2jhOMt1pWcITLQyy02FV8qenLagWPZmLh7Ceg/4AIRei7DhzzOi5c9evLEb/0Nj19bsQlLqmxiOh3KU5PbJgDi9VeJfuN/4QKBgQDTcK4GQjczpwAvjIwnSJdU6k4DM/JBv88xEfxaGfhvbtDBj0HlBjfBFxk13m21MVE0p/DB0OMTUPDb1A9BNjmhHLz1E/wcfNnu8UT5LQDMNAFmEkZOxdh6qoijvQ49Sbjw2dSfm2HHVzp7hr2PW7tlGYG+ALl26y270dxonHBW2wKBgQCjZhhFVDbRWdY4PllQqe2d9Iq9hJ/5iw4hoRXQPFapDrtwptYlpmluoVP95z9OF+O6D7BO0PRLic52Gy52nOjDmlVA0dk+YhtWEbsoTaZofduxbUjlO2wr1QpHPrMuyb1hbuxEqvT1vFw1rFeyFVrVEWBL81ywpeXvbh29pkNCcQKBgE0KRm5DXCe21qt8k2iQ24r2IFysZb2tLModWoxd4BaCExAjqYfQPypcxzPIisK1aHg+JMwJ12MnX8tJNhG1t0PL29GUaYzbtPCJ+m6sBhlhbY0KZZG4JstzLXwzm2ebYAZp6D4LeJIQZ1+w1YrRirMomwxm6Sy6PhysN5nqPkh3AoGAUhRiEsl38/gV1RD02sFRnKwP2Z26oqcIhToe9AirW6cL303fevA6PBmMUJoOQdNcUMW6wgzS+vMRpGCJGYo+nqtzMel4II81vimQA3HmKs02Q81q9cPA1c/hpuJHLjSnDj+jLedWv+5Lv6aAMvPpOejNn7lzEUV02K5PAEp5tPECgYEAj44RXSGlkR9mCOxMG9vn8ffdKjpSWLQ3B/KQWmF3TU4VoLJVwIMcoTF8wnZuSkBb61egZYOpU+dkb2Vomxu8CA8K38krn8EUldutX590qGpNXVhErOHCbXzFExXDSFuowh3NNLns4bzEEBrgyKtc8KSoG+Fa5CegR1ORhtGkUJ0=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnOiGKXdMs90wWyksgHxzwn8dv4tRhyd2lwbv01tMSi2Z8pUJiO9t0mBaRGzXOYNpSkQzuXXuJl8Jjs1K/3RJWZFLjVRZI1QSUSVJNFvKA0OF4KZ9puUEE85DXQqYg32RV5Soz4uCBgIuoFXKRsI4cl1GopIDFqbTsnRWxDk9mD+SjpxZPQve9nLnD3SJCWd6kMLud1RpdK4LnN26kaDPYh9Okf753iBX6TuN5gK0PjFrwNmn2e2s1jgrTIFNrfz9a4zcrRScxSi32VBV+YppAAXJvgiIrBC5BjKNlOHz6ukPQO1DYjtjLIbnko87ao0rOZtHEmHyFRBfUEUKvwtpgQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://alipaytwo.free.idcfengye.com/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://alipaytwo.free.idcfengye.com/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
            System.out.println(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

