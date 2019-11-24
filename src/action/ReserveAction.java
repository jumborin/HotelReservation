package action;

import com.opensymphony.xwork2.Action;

import dao.ReserveDao;
import entity.Reserve;
import entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

/**
 * 予約処理を行うアクションクラス
 *
 * @author jumborin
 */
public class ReserveAction implements Action, SessionAware {

    private Logger logger = LogManager.getLogger(ReserveAction.class);
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
    @Getter
    @Setter
    private String userId = "";
    @Getter
    @Setter
    private String reserveId = "";
    @Getter
    @Setter
    private Date startDate = new Date();
    @Getter
    @Setter
    private Date endDate = new Date();
    @Getter
    @Setter
    private Integer number = 0;
    @Getter
    @Setter
    private String plan = "";

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
	if (user.getUserName() == null) {
	    logger.error("ログインされていない状態で起動されました");
	    return "loginError";
	}

	// ヘッダーに表示するユーザ名を取得
	this.userName = user.getUserName();
	logger.debug("{},{}", user.getUserId(), user.getUserName());

	// Entityに画面項目をセット
	Reserve reserve = new Reserve();
	reserve.setReserveId(this.reserveId);
	reserve.setStartDate(this.startDate);
	reserve.setEndDate(this.endDate);
	reserve.setNumber(this.number);
	reserve.setPlan(this.plan);

	// ロジック処理
	ReserveDao reserveDao = new ReserveDao();
	boolean resultFlag = reserveDao.insert(reserve);

	// 結果処理
	if (resultFlag) {
	    logger.info("「{}」プランで予約されました。", plan);
	} else {
	    logger.info("「{}」プランは予約できませんでした。", plan);
	}

	// 画面遷移
	return "complete";
    }
}