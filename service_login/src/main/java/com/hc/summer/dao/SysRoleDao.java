package com.hc.summer.dao;

import com.hc.summer.db.tables.records.SysRoleRecord;
import org.jooq.SelectJoinStep;
import org.springframework.stereotype.Repository;

import static com.hc.summer.db.tables.SysRole.SYS_ROLE;
import static com.hc.summer.db.tables.SysUserRole.SYS_USER_ROLE;

/**
 * 角色数据库层
 *
 * @author wendiyou
 * @date 2021-06-03
 */
@Repository
public class SysRoleDao extends BaseDao {

    /**
     * 查询指定用户ID对应的角色信息
     */
    public SysRoleRecord getUserRoleByUserId(Long userId) {
        SelectJoinStep<?> from = db.select()
                .from(SYS_ROLE)
                .innerJoin(SYS_USER_ROLE).on(SYS_USER_ROLE.ROLE_ID.eq(SYS_ROLE.ID));
        from.where(SYS_USER_ROLE.USER_ID.eq(userId));

        return from.fetchOneInto(SysRoleRecord.class);
    }
}
