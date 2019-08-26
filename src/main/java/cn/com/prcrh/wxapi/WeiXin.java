
package cn.com.prcrh.wxapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import cn.com.prcrh.model.weixin.AccessToken;
import cn.com.prcrh.model.weixin.ReturnCode;
import cn.com.prcrh.util.HttpRequest;
import cn.com.prcrh.util.WeiXinConfig;
import net.sf.json.JSONObject;

/**
* @author karl E-mail:1834007615@qq.com
* @version 创建时间：2019年8月12日 下午4:02:39
* 类说明
*/
@Component
public class WeiXin {
	
	public static String getOpenIdByCode(String code) {
		HttpRequest httpRequest = new HttpRequest();
		String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wx2391c9e755d95733&secret=32db568813ddd966a1acb283b66aacab&js_code="+code+"&grant_type=authorization_code";
		String data = httpRequest.sendGet(url);
		JSONObject SessionKeyOpenId= JSONObject.fromObject(data);
		if(SessionKeyOpenId.toString().indexOf("openid")<0) {
			  return null;	
		}
	    String openId = SessionKeyOpenId.getString("openid");

		return openId;
	}
	
	
	public static String getWeiXinUserInfo(ReturnCode code) {

		StringBuffer strb = new StringBuffer();
		
		InputStreamReader reader = null;
		
		BufferedReader breader = null;

		try {
			URL url = new URL("https://api.weixin.qq.com/sns/userinfo?access_token="+code.getAccess_token()+"&openid="+code.getOpenid()+"&lang=zh_CN");

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.connect();

			reader = new InputStreamReader(connection.getInputStream());

			breader = new BufferedReader(reader);

			String str = null;
		
			while (null != (str = breader.readLine())) {

				strb.append(str);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			breader.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return strb.toString();

	}
	
	
	/**
	 * 获取access_token
	 * @return
	 */
	public static AccessToken getAccessToken() {
		AccessToken accessToken = null;
		InputStreamReader reader = null;
		BufferedReader breader = null;
		try {
			URL url = new URL(WeiXinConfig.ACCESS_TOKEN_URL);

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.connect();

			reader = new InputStreamReader(connection.getInputStream());

			breader = new BufferedReader(reader);

			String str = null;
			StringBuffer strb = new StringBuffer();
			while (null != (str = breader.readLine())) {

				strb.append(str);

			}

			Gson gson = new Gson();

			accessToken = gson.fromJson(strb.toString(), AccessToken.class);

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			breader.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return accessToken;
	}
	
	public static String getUri(String redirect_uri, String state) {
		return "https://open.weixin.qq.com/connect/oauth2/authorize?appid="
			+ WeiXinConfig.APP_ID + "&redirect_uri=" + URLEncoder.encode(redirect_uri)
			+ "&response_type=code&scope=snsapi_userinfo&state=" + state
			+ "#wechat_redirect";
	}
	
	public static ReturnCode getReturnCode(String code) {

		
		ReturnCode returnCode = null;
		
		InputStreamReader reader = null;
		BufferedReader breader = null;

		try {
			URL url = new URL("https://api.weixin.qq.com/sns/oauth2/access_token?appid="+WeiXinConfig.APP_ID+"&secret="+WeiXinConfig.APP_SECRET+"&code="+code+"&grant_type=authorization_code");

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.connect();

			reader = new InputStreamReader(connection.getInputStream());

			breader = new BufferedReader(reader);

			String str = null;
			StringBuffer strb = new StringBuffer();
			while (null != (str = breader.readLine())) {

				strb.append(str);

			}

			Gson gson = new Gson();

			returnCode = gson.fromJson(strb.toString(), ReturnCode.class);

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			breader.close();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return returnCode;

	}
}


