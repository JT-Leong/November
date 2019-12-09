package com.classbook.chapter.wechat.factory;

import com.classbook.chapter.wechat.loginform.LoginForm;

import javax.swing.*;

/**
 * @program: classprogram
 * @Description:
 * @author: JT
 * @date: 2019/11/18 1:32 下午
 */
public class FactoryLoginForm extends FactoryForm {
    /**
     * @Description: 生产窗体
     * @Param: []
     * @return: javax.swing.JFrame
     * @Author: JT
     * @Date: 2019/11/18 1:31 下午
     */
    @Override
    public JFrame getJFrame() {
        return new LoginForm();
    }
}
