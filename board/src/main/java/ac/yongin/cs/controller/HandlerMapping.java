package ac.yongin.cs.controller;

import java.util.HashMap;
import java.util.Map;

public class HandlerMapping {
	private Map<String, Controller> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login_proc.do",new LoginController());
		mappings.put("/getBoardList_proc.do",new GetBoardListController());
		mappings.put("/getBoard_proc.do",new GetBoardController());
		mappings.put("/insertBoard_proc.do",new InsertBoardController());
		mappings.put("/updateBoard_proc.do",new UpdateBoardController());
		mappings.put("/deleteBoard_proc.do",new DeleteBoardController());
		mappings.put("/logout_proc.do",new LogoutController());
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}
}

