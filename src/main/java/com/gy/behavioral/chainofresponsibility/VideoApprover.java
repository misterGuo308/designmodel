package com.gy.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @author guoyou
 * @date 2019/10/15 11:09
 */
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if(StringUtils.isNotEmpty(course.getVideo())){
            System.out.println(course.getName()+"含有视频批准");
            if(approver!=null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"未含有视频不批准");
            return;
        }
    }
}
