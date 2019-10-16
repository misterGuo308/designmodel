package com.gy.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guoyou
 * @date 2019/9/19 16:51
 */
public class EmploveeFactory {

    private static final Map<String, Emplovee> EMPLOVEE_MAP = new HashMap<String, Emplovee>();

    public static Emplovee getManager(String department) {
        Manager manager = (Manager) EMPLOVEE_MAP.get(department);

        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理"+department);
            String reportContent =department+"部门汇报:此次汇报内容为.......";
            manager.setReportContent(reportContent);
            System.out.println("创建报告:"+reportContent);
            EMPLOVEE_MAP.put(department,manager);

        }

        return manager;
    }
}
