package action;

import com.opensymphony.xwork2.Action;

import entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

/**
 * マイページの処理を行うアクションクラス
 *
 * @author jumborin
 */
public class MyPageAction implements Action, SessionAware {

    private Logger logger = LogManager.getLogger(MyPageAction.class);
    private Map<String, Object> session;

    /**
     * セッション取り出し処理
     */
    @Override
    public void setSession(Map<String, Object> session) {
	this.session = session;
    }

    // ヘッダ表示項目
    @Getter
    @Setter
    private String userName = "";

    // 画面入出力項目

    /**
     * ロジック処理
     */
    @Override
    public String execute() throws Exception {

	// セッションからヘッダーのユーザ名を設定
	User user = (User) session.get("user");

	// ログインしてなかった時にログイン画面に遷移
	if (user == null) {
	    logger.error("ログインしていません");
	    return "loginError";
	}

	// ログインしてなかった時にログイン画面に遷移
	if (user.getUserName() == null) {
	    logger.error("ログインしていません");
	    return "loginError";
	}

	// ヘッダーに表示するユーザ名を取得
	this.userName = user.getUserName();
	logger.debug("{},{}", user.getUserId(), user.getUserName());

	// 画面遷移
	return "add";
    }
}