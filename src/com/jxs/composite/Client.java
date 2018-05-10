package com.jxs.composite;

/**
 * Created by jiangxs on 2018/5/10.
 */
public class Client {

    public static void main(String[] args) {

        // 生成树根root，根上长出两片LeafA和LeafB
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        // 根上长出分枝Composite X，分枝上也有两叶Leaf XA和Leaf XB
        Composite composite1 = new Composite("Composite X");
        composite1.add(new Leaf("Leaf XA"));
        composite1.add(new Leaf("Leaf XB"));
        root.add(composite1);

        // 在Composite X上再长出分枝Composite XY，分枝上也有两叶Leaf XYA和Leaf XYB
        Composite composite2 = new Composite("Composite XY");
        composite2.add(new Leaf("Leaf XYA"));
        composite2.add(new Leaf("Leaf XYB"));
        composite1.add(composite2);

        // 根部又长出两叶Leaf C和Leaf D，可惜Leaf D没长牢，被风吹走了
        root.add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);
        root.display(1);
    }
}
