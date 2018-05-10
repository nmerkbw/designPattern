package com.jxs.MementoExample;

/**
 * Created by jiangxs on 2018/5/10.
 */
public class GameRole {

    // 生命力
    private int vitality;
    // 攻击力
    private int attack;
    // 防御力
    private int defense;

    public int getVitality() {

        return vitality;
    }

    public void setVitality(int vitality) {

        this.vitality = vitality;
    }

    public int getAttack() {

        return attack;
    }

    public void setAttack(int attack) {

        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    // 获取角色的初始状态
    public void getInitState() {

        vitality = 10000;
        attack = 500;
        defense = 5;
    }

    // 创建角色状态存档
    public RoleStateMemento createRoleStateMemento() {

        return new RoleStateMemento(vitality, attack, defense);
    }

    // 回复角色状态
    public void recoverRoleState(RoleStateMemento roleStateMemento) {

        this.vitality = roleStateMemento.getVitality();
        this.attack = roleStateMemento.getAttack();
        this.attack = roleStateMemento.getDefense();
    }

    // 战斗
    public void fight() {

        vitality = 0;
        attack = 0;
        defense = 0;
    }

    //状态显示
    public void displayState() {

        System.out.println("角色当前状态：");
        System.out.println("生命值：" + vitality);
        System.out.println("攻击力：" + attack);
        System.out.println("防御力：" + defense);
        System.out.println();
    }

}
