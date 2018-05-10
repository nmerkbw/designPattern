package com.jxs.MementoExample;

/**
 * Created by jiangxs on 2018/5/10.
 *
 * 角色状态存储箱类
 */
public class RoleStateMemento {

    // 生命力
    private int vitality;
    // 攻击力
    private int attack;
    // 防御力
    private int defense;

    public RoleStateMemento(int vitality, int attack, int defense) {

        this.vitality = vitality;
        this.attack = attack;
        this.defense = defense;
    }

    public int getVitality() {
        return vitality;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
}
