package action;

import com.opensymphony.xwork2.Action;

import dao.ReserveDao;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 予約処理を行うアクションクラス
 *
 * @author jumborin
 *
 */
public class ReserveAction implements Action {

    private Logger logger = LogManager.getLogger(ReserveAction.class);

    @Getter
    @Setter
    private String userId = "";
    @Getter
    @Setter
    private String startDate = "";
    @Getter
    @Setter
    private String endDate = "";
    @Getter
    @Setter
    private String number = "";
    @Getter
    @Setter
    private String plan = "";

    @Override
    public String execute() throws Exception {
	ReserveDao reserveDao = new ReserveDao();
	boolean resultFlag = reserveDao.insert();
	if (resultFlag) {
	    logger.info("「{}」プランで予約されました。", plan);
	} else {
	    logger.info("「{}」プランは予約できませんでした。", plan);
	}
	return "complete";
    }
}
