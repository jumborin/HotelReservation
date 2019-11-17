package action;

import com.opensymphony.xwork2.Action;

import dao.UserDao;
import entity.User;
import lombok.Getter;
import lombok.Setter;

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
    @Getter
    @Setter
    private String userid = "";
    @Getter
    @Setter
    private String password = "";

    @Override
    public String execute() throws Exception {
	UserDao userDao = new UserDao();
	User user = new User();
	user.setUserId(userid);
	user.setPassword(password);
	user = userDao.select(user);
	if (user.getUserName().equals("")) {
	    logger.error("「{}」がログインできませんでした。", userid);
	    return "error";
	} else {
	    logger.info("「{}」がログインしました。", userid);
	    return "found";
	}
    }
}
