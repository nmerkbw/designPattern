package com.jxs.MementoExample;

/**
 * Created by jiangxs on 2018/5/10.
 * <p>
 * 角色状态管理者
 */
public class RoleStateCaretaker {

    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {

        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {

        this.roleStateMemento = roleStateMemento;
    }
}
