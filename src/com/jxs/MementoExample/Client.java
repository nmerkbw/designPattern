package com.jxs.MementoExample;

/**
 * Created by jiangxs on 2018/5/10.
 */
public class Client {

    public static void main(String[] args) {

        // 大战Boss前
        GameRole jxs = new GameRole();
        jxs.getInitState();
        jxs.displayState();

        // 感觉不妥，先存个档
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setRoleStateMemento(jxs.createRoleStateMemento());

        // 和Boss战斗，被秒杀
        jxs.fight();
        jxs.displayState();

        // 读取存档，恢复打Boss之前的状态
        jxs.recoverRoleState(stateAdmin.getRoleStateMemento());
        jxs.displayState();
    }


}
