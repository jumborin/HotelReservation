package action;

import com.opensymphony.xwork2.Action;

/**
 * マイページボタンのメニュー用アクション
 *
 * @author jumborin
 *
 */
public class Menu_MyPageAction implements Action {
    /**
     * ロジック処理
     */
    @Override
    public String execute() throws Exception {
	return "next_page";
    }
}