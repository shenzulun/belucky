package org.magen.belucky.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.magen.belucky.dao.IAuthDao;
import org.magen.belucky.dao.base.BaseDaoImpl;
import org.magen.belucky.entity.User;
import org.magen.belucky.util.DateTimeUtil;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("authDao")
public class AuthDaoImpl extends BaseDaoImpl implements IAuthDao{

	public User queryUserByUserNo(String userNo) {
		User user = null;
		try{
			List<User> list = this.getJdbcTemplate().query("select * from t_user t where t.user_no=?", 
					new Object[]{userNo},new UserMapper());
			if(list != null && list.size() > 0){
				user = list.get(0);
			}
		}catch(Exception e){
			log.error("用户查询失败",e);
		}
		return user;
	}
	
	private static final class UserMapper implements RowMapper<User> {

		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setUserNo(rs.getString("user_no"));
			user.setPassword(rs.getString("password"));
			user.setStatus(rs.getString("status"));
			String createDt = rs.getString("create_dt");
			if(createDt != null){
				user.setCreateDt(DateTimeUtil.parse(createDt));
			}		
			return user;
		}
	}
}
