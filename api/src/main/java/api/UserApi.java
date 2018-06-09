package api;


import com.java4all.domain.User;

/**
 * Author: momo
 * Date: 2018/6/9
 * Description:对外服务的接口
 */
public interface UserApi {
    /**根据id查询user*/
    User getUserById(Integer id);
}
