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

	// ログイン状況のチェック
	User user = (User) session.get("user");
	if (user == null) {
	    logger.error("ログインしていません");
	    return "loginError";
	}

	// ログイン状況のチェック
	if (user.getUserName() == null) {
	    logger.error("ログインしていません");
	    return "loginError";
	}

	// 画面遷移
	userName = user.getUserName();
	logger.debug("{},「{}」がマイページを開きました。", user.getUserId(), user.getUserName());
	return "add";
    }
}