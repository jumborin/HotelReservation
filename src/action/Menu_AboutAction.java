package action;

import com.opensymphony.xwork2.Action;

/**
 * 客室ボタンのメニュー用アクション
 *
 * @author jumborin
 *
 */
public class Menu_AboutAction implements Action {
    /**
     * ロジック処理
     */
    @Override
    public String execute() throws Exception {
	return "next_page";
    }
}