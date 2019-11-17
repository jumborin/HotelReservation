package action;

import com.opensymphony.xwork2.Action;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * マイページの処理を行うアクションクラス
 *
 * @author jumborin
 *
 */
public class MyPageAction implements Action {

    private Logger logger = LogManager.getLogger(MyPageAction.class);
    @Getter
    @Setter
    private String userId = "";

    @Getter
    @Setter
    private String plan ="";

    @Override
    public String execute() throws Exception {
	logger.info("入力されたパラメータは「{}」です。", userId);
	return "add";
    }
}
