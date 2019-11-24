package action;

import com.opensymphony.xwork2.Action;

import dao.UserDao;
import entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

/**
 * ログインログアウト認証を行うアクションクラス
 *
 * @author jumborin
 *
 */
public class AuthAction implements Action, SessionAware {

    private Logger logger = LogManager.getLogger(AuthAction.class);
    private Map<String, Object> session;

    /**
     * セッション取り出し処理
     */
    @Override
    public void setSession(Map<String, Object> session) {
	this.session = session;
    }

    @Getter
    @Setter
    private String userId = "";
    @Getter
    @Setter
    private String userName = "";
    @Getter
    @Setter
    private String password = "";

    /**
     * ロジック処理
     */
    @Override
    public String execute() throws Exception {

	// Entityに画面項目をセット
	User user = new User();
	user.setUserId(this.userId);
	user.setPassword(this.password);

	// ロジック処理
	UserDao userDao = new UserDao();
	session.put("user", user);
	user = userDao.select(user);

	// 結果処理
	if (user.getUserName().equals("")) {
	    logger.error("「{}」がログインできませんでした。", userId);
	    return "loginError";
	}

	logger.info("「{}」がログインしました。", userId);
	session.put("user", user);

	// ヘッダーに表示するユーザ名を取得
	this.userName = user.getUserName();
	logger.debug("{},{}", user.getUserId(), user.getUserName());

	// 画面遷移
	return "found";
    }
}
