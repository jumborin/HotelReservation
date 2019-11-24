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
 * マイページボタンのメニュー用アクション
 *
 * @author jumborin
 *
 */
public class Menu_MyPageAction implements Action, SessionAware {

    private Logger logger = LogManager.getLogger(Menu_MyPageAction.class);
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
	User user = (User) session.get("user");
	this.userName = user.getUserName();
	logger.debug("{},{}", user.getUserId(), user.getUserName());
	return "next_page";
    }
}