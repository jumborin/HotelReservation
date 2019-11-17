/**
 * 認証クラス
 */
package action;

import com.opensymphony.xwork2.Action;

/**
 * @author jumborin
 *
 */
public class TopAction implements Action {
    @Override
    public String execute() throws Exception {
	return "ok";
    }
}
