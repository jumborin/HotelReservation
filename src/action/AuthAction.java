package action;

import com.opensymphony.xwork2.Action;

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
	// TODO 自動生成されたメソッド・スタブ
	logger.info("「{}」がログインしました。", userid);
	return "found";
	// return "error";
    }
}
