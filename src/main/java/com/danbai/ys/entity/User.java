package com.danbai.ys.entity;

import javax.persistence.*;

public class User {
    /**
     * �û�id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * �û���
     */
    private String username;

    /**
     * �û����� 0 ���� 1��ͨ 2 ����Ա
     */
    @Column(name = "user_type")
    private Integer userType;

    /**
     * �û�����
     */
    private String password;

    private String email;

    private String headurl;

    /**
     * ��ȡ�û�id
     *
     * @return id - �û�id
     */
    public Integer getId() {
        return id;
    }

    /**
     * �����û�id
     *
     * @param id �û�id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��ȡ�û���
     *
     * @return username - �û���
     */
    public String getUsername() {
        return username;
    }

    /**
     * �����û���
     *
     * @param username �û���
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ�û����� 0 ���� 1��ͨ 2 ����Ա
     *
     * @return user_type - �û����� 0 ���� 1��ͨ 2 ����Ա
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * �����û����� 0 ���� 1��ͨ 2 ����Ա
     *
     * @param userType �û����� 0 ���� 1��ͨ 2 ����Ա
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * ��ȡ�û�����
     *
     * @return password - �û�����
     */
    public String getPassword() {
        return password;
    }

    /**
     * �����û�����
     *
     * @param password �û�����
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return headurl
     */
    public String getHeadurl() {
        return headurl;
    }

    /**
     * @param headurl
     */
    public void setHeadurl(String headurl) {
        this.headurl = headurl;
    }
}