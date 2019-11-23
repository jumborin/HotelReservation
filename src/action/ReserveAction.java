package action;

import com.opensymphony.xwork2.Action;

import dao.ReserveDao;
import entity.Reserve;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 予約処理を行うアクションクラス
 *
 * @author jumborin
 */
public class ReserveAction implements Action {

    private Logger logger = LogManager.getLogger(ReserveAction.class);

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

	// Entityに画面項目をセット
	Reserve reserve = new Reserve();
	reserve.setReserveId(reserveId);
	reserve.setStartDate(startDate);
	reserve.setEndDate(endDate);
	reserve.setNumber(number);
	reserve.setPlan(plan);

	// ロジック処理
	ReserveDao reserveDao = new ReserveDao();
	boolean resultFlag = reserveDao.insert(reserve);

	// 結果処理
	if (resultFlag) {
	    logger.info("「{}」プランで予約されました。", plan);
	} else {
	    logger.info("「{}」プランは予約できませんでした。", plan);
	}
	return "complete";
    }
}