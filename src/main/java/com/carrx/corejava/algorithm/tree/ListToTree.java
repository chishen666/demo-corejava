package com.carrx.corejava.algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;

/**
 * @author Carl.Xiang
 * @date 2020/03/05
 */
public class ListToTree {
    public static void main(String[] args) {
        Menu menu1 = new Menu("1", "", "系统管理");
        Menu menu11 = new Menu("11", "1", "参数管理");
        Menu menu12 = new Menu("12", "1", "国际化管理");
        Menu menu13 = new Menu("13", "1", "权限管理");
        Menu menu131 = new Menu("131", "13", "用户管理");
        Menu menu132 = new Menu("132", "13", "角色管理");
        Menu menu133 = new Menu("133", "13", "组织管理");

        List<Menu> menuList = new ArrayList<>();
        menuList.add(menu1);
        menuList.add(menu11);
        menuList.add(menu12);
        menuList.add(menu13);
        menuList.add(menu131);
        menuList.add(menu132);
        menuList.add(menu133);
        List<Menu> result = new ArrayList<>();
        if (menuList != null) {
            result = menuList.stream().filter(menu -> {
                return StringUtils.isBlank(menu.getpId());
            }).collect(Collectors.toList());
        }
        for (Menu menu : menuList) {

        }

        System.out.println(new Gson().toJson(result));
    }
}

class Menu {
    private String id;
    private String pId;
    private String name;
    private List<Menu> childs;

    public Menu(String id, String pId, String name) {
        this.id = id;
        this.pId = pId;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Menu> getChilds() {
        return childs;
    }

    public void setChilds(List<Menu> childs) {
        this.childs = childs;
    }
}
