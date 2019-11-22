package action;

import com.opensymphony.xwork2.Action;

import entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

/**
 * マイページの処理を行うアクションクラス
 *
 * @author jumborin
 *
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

    @Getter
    @Setter
    private String userName = "";

    @Getter
    @Setter
    private String plan = "";

    @Override
    public String execute() throws Exception {
	User user = (User) session.get("user");
	userName = user.getUserName();
	if (user.getUserId() != null) {
	    logger.info("入力されたパラメータは「{}」です。", user.getUserId());
	}
	return "add";
    }
}
