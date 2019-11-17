package action;

import com.opensymphony.xwork2.Action;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * ログインログアウト認証を行うアクションクラス
 *
 * @author jumborin
 *
 */
public class AuthAction implements Action {

    private Logger logger = LogManager.getLogger(AuthAction.class);
    private String userid = "";
    private String password = "";

    @Override
    public String execute() throws Exception {
	// TODO 自動生成されたメソッド・スタブ
	logger.info("入力されたパラメータは「{}」です。", userid);
	return "found";
    }

    /**
     * @return userid
     */
    public String getUserid() {
	return userid;
    }

    /**
     * @param userid セットする userid
     */
    public void setUserid(String userid) {
	this.userid = userid;
    }

    /**
     * @return password
     */
    public String getPassword() {
	return password;
    }

    /**
     * @param password セットする password
     */
    public void setPassword(String password) {
	this.password = password;
    }

}
