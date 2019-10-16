package com.gy.behavioral.chainofresponsibility;


import org.apache.commons.lang3.StringUtils;

/**
 * @author guoyou
 * @date 2019/10/15 10:58
 */
public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())) {
            System.out.println(course.getName() + "含有手记批准");
            if (approver != null) {
                approver.deploy(course); }
        } else {
            System.out.println(course.getName() + "不包含手记不批准流程结束");
            return;
        }

    }
}
