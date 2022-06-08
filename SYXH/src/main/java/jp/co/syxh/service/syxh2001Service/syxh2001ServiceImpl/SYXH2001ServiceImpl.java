/*
 * @诗屿星河
 */
package jp.co.syxh.service.syxh2001Service.syxh2001ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jp.co.syxh.service.syxh2001Service.SYXH2001Service;
import jp.co.syxh.mapper.SYXH2001Mapper;

/**
 * SYXH2001ServiceImpl.<br>
 * 
 * @author M
 */
public class SYXH2001ServiceImpl implements SYXH2001Service {
	
	@Autowired
	private SYXH2001Mapper syxh2001Mapper;
	
	public List<String> handleLogic() {
		List<String> list = syxh2001Mapper.syxh20010001Select("1");
		return list;
	}

}
