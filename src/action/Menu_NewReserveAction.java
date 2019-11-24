package action;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

import entity.User;
import lombok.Getter;
import lombok.Setter;

/**
 * 予約ボタンのメニュー用アクション
 *
 * @author jumborin
 *
 */
public class Menu_NewReserveAction implements Action, SessionAware {

    private Logger logger = LogManager.getLogger(Menu_NewReserveAction.class);
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
    private String userName = "";

    /**
     * ロジック処理
     */
    @Override
    public String execute() throws Exception {

	// セッションからヘッダーのユーザ名を設定
	User user = (User) session.get("user");

	// ログインしてなかった時にログイン画面に遷移
	if (user == null) {
	    logger.error("ログインされていない状態で起動されました");
	    return "loginError";
	}

	// ログインしてなかった時にログイン画面に遷移
	if (user.getUserName() == null) {
	    logger.error("ログインされていない状態で起動されました");
	    return "loginError";
	}

	// ヘッダーに表示するユーザ名を取得
	this.userName = user.getUserName();
	logger.debug("{},{}", user.getUserId(), user.getUserName());

	// 画面遷移
	return "next_page";
    }
}
