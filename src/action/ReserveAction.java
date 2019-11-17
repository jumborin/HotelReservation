package action;

import com.opensymphony.xwork2.Action;

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
    private String userid = "";
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
	logger.info("「{}」プランで予約されました。", plan);
	return "complete";
    }
}
